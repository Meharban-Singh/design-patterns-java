package command;

import java.util.*;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;

    private Stack<UndoableCommand> undoCommands;
    private Stack<UndoableCommand> redoCommands;
   
    
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
 
        NoCommand noCommand = new NoCommand();
        for(int i=0;i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommands = new Stack<>();
        redoCommands = new Stack<>();
    }
  
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
 
    public void onButtonWasPushed(int slot) {

        if(onCommands[slot] instanceof UndoableCommand) {
            UndoableCommand toDo = (UndoableCommand)((UndoableCommand)onCommands[slot]).clone();
            toDo.execute();
            undoCommands.push(toDo);

            resetRedoCommands();
        }
        else {
            onCommands[slot].execute();
        }
    }
 
    public void offButtonWasPushed(int slot) {
        if(onCommands[slot] instanceof UndoableCommand) {
            UndoableCommand toDo = (UndoableCommand)((UndoableCommand)offCommands[slot]).clone();
            toDo.execute();
            undoCommands.push(toDo);

            resetRedoCommands();
        }
        else {
            offCommands[slot].execute();
        }
    }

    /**
     * Resets the redo Stack to be empty with just the noCommand on it.
     * This is needed because when a button is pressed (unless its redo or undo),
     * the redo stack shouldn't go back to the last command. Example:
     * 
     * Light on > Light Off > Undo (so the light is on) -> light dim -> Redo (this should NOT turn the light off again)
     *
     */
    private void resetRedoCommands() {
        while(!redoCommands.empty())
            redoCommands.pop();    
    }

    /**
     * Undoes the last command
     * If there is no last command, it executes the NoCommand instead 
     */
    public void undoButtonWasPushed() {
        if(undoCommands.empty()) {
            new NoCommand().execute();
            return;
        }

        UndoableCommand last = undoCommands.pop();
        last.undo();
        redoCommands.push(last);
    }
    
    // ADDED THIS METHOD
    /**
     * Redoes the last undid command
     * If there is no last command to redo, it executes the NoCommand instead 
     */
    public void redoButtonWasPushed() {
        if(redoCommands.empty()) {
            new NoCommand().execute();
            return;
        }

        UndoableCommand last = redoCommands.pop();
        last.execute();
        undoCommands.push(last);
    }
  
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommands.peek().getClass().getName() + "\n"); // CHANGED THIS LINE
        stringBuff.append("[redo] " + redoCommands.peek().getClass().getName() + "\n"); // ADDED THIS LINE
        return stringBuff.toString();
    }
}
