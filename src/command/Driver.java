package command;

// CODE OBTAINED FROM: Head First Design Patterns - dofactory.com but changed to fit needs, added undo redo commands

/*
 * Command Pattern
 * ==============
 * Say you have a Ceiling fan among other devices (Light, Garage door etc). Well those have their own implementations,
 * provided from the place you buy it from. All you know is you can turn it on and off and so on. Say you wanna create a
 * RemoteControl to have as many commands of these types. This pattern helps you to achieve just that. You have an interface
 * Command and, in this implementation, another one called UndoableCommand and all the commands implement one of these.
 *
 */
public class Driver {
 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
		CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanLowCommand ceilingFanLow = 
				new CeilingFanLowCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanLow, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
   
		System.out.println("go to low, medium, high, medium, low, high");
		remoteControl.onButtonWasPushed(0); // ->low
		remoteControl.onButtonWasPushed(1); // ->medium
		remoteControl.onButtonWasPushed(2); // ->high
		remoteControl.onButtonWasPushed(1); // ->medium
		remoteControl.onButtonWasPushed(0); // ->low
		remoteControl.onButtonWasPushed(2); // ->high
		
		System.out.println("6 undo commands");
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed(); 
		remoteControl.undoButtonWasPushed();
		
		System.out.println("6 redo commands");
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
		remoteControl.redoButtonWasPushed(); 
	}
}
