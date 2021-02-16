package command;

public abstract class UndoableCommand implements Command, Cloneable {
    public abstract void undo();

    @Override
    public Object clone() {
        try {
            return (Command)super.clone();
        }
        catch(CloneNotSupportedException e) {
            System.out.println("Clone not supported " + e.getMessage());
            return null;
        }
    }
}
