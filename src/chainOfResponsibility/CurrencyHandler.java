package chainOfResponsibility;

public abstract class CurrencyHandler {
    // Protected fields so sub classes can access them
    protected CurrencyHandler successor;
    protected int numBills;

    /**
     * Sets the next handler in the pipeline acc to Chain of responsibility principle.
     */
    public void setSuccessor(CurrencyHandler s) {
        this.successor = s;
    }

    /**
     * Sets the number of bills in the currect handler.
     */
    public void setNumberOfBills(int n) {
        this.numBills = n;
    }

    /**
     * Dispenses the amount from the handler.
     *
     * @param amount amount to dispense
     * @return boolean
     */
    public abstract boolean dispense(double amount);
}