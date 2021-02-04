package state;

public class OffState implements State {
    private Printer printer;

    /**
     * Inits the state for the printer
     *
     * @param Printer printer
     */
    public OffState(Printer printer) { this.printer = printer; }

    /**
     * Turns off the printer
     */
    @Override
    public void turnOff() {
        System.out.println("Cannot turn off since its already off!");
    }

    /**
     * Prints the text
     *
     * @param whatToPrint
     */
    @Override
    public void print(String whatToPrint) {
        System.out.println("Cannot print until you turn on the printer");
    }

    /**
     * Cancels the print
     */
    @Override
    public void cancelPrint() {
        System.out.println("Cannot cancel since the printer is off.");
    }

    /**
     * Turns on the printer
     */
    @Override
    public void turnOn() {
        System.out.println("Printer turned on");
        this.printer.setState(this.printer.getState("idle"));
    }
}
