package state;

public class PrintingState implements State {

    private Printer printer;

    /**
     * Inits the state for the printer
     *
     * @param Printer printer
     */
    public PrintingState(Printer printer) { this.printer = printer; }

    /**
     * Turns off the printer
     */
    @Override
    public void turnOff() {
        System.out.println("Cannot turn off due to printing in progress!");
    }

    /**
     * Prints the text
     *
     * @param whatToPrint
     */
    @Override
    public void print(String whatToPrint) {
        System.out.println("Added " + whatToPrint + " to the printing queue.");
    }

    /**
     * Cancels the print
     */
    @Override
    public void cancelPrint() {
        System.out.println("Cancelled all print jobs.");
        this.printer.setState(this.printer.getState("idle"));
    }

    /**
     * Turns on the printer
     */
    @Override
    public void turnOn() {
        System.out.println("Printer already on");
    }
}
