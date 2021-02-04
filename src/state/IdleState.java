package state;

public class IdleState implements State {
    private Printer printer;

    /**
     * Inits the state for the printer
     *
     * @param Printer printer
     */
    public IdleState(Printer printer) { this.printer = printer; }

    /**
     * Turns off the printer
     */
    @Override
    public void turnOff() {
        System.out.println("Successfully turned the printer off! Good night :)");
        this.printer.setState(this.printer.getState("off"));
    }

    /**
     * Prints the text
     *
     * @param whatToPrint
     */
    @Override
    public void print(String whatToPrint) {
        System.out.println("Printing " + whatToPrint + "....");
        this.printer.setState(this.printer.getState("printing"));
    }

    /**
     * Cancels the print
     */
    @Override
    public void cancelPrint() {
        System.out.println("Print Queue is already empty.");
    }

    /**
     * Turns on the printer
     */
    @Override
    public void turnOn() {
        System.out.println("Printer already on");
    }
}
