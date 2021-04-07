package chainOfResponsibility;

public class ATM {
    private CurrencyHandler handler;

    /**
     * Creates a new ATM object
     */
    public ATM() {}

    /**
     * Dispenses the set amount from the ATM, if it is legal to do so.
     *
     * @param amount
     */
    public void dispense(double amount) {
        handler.dispense(amount);
    }

    /**
     * Sets the first handler for the COR pipeline.
     */
    public void setHandler(CurrencyHandler handler) {
        this.handler = handler;
    }
}