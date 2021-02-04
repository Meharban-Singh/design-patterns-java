package state;

/*
 * State Design pattern
 * =======================
 *
 * A Printer can be in one fo the 3 states at a time - printing, off or idle.
 * Without knowing the state, we can try to perform different actions on the printer and it
 * does different things depending on the state (and yes, we DO NOT know what the state is in
 * this class, or in other words, the Client will never know the state of the printer).
 *
 * Actions: turnOn(), turnOff(), cancelPrint(), print(String)
 *
 *
 * This is sort of similar to strategy, the major difference being that the Client never knows
 * about the state of the printer, it just behaves different. In strategy, the Client has to change
 * the algorithms, or strategies, to change behaviour. 
 */
public class Driver {
    public static void main(String[] args) {
        Printer hPPrinter = new Printer();

        hPPrinter.print("My name is Meharban Singh"); // fails since the printer is off
        hPPrinter.turnOn(); // turn it on now and print again
        hPPrinter.print("My name is Meharban Singh"); // success
    }
}
