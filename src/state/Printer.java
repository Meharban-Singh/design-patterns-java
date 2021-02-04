package state;

public class Printer {

    // define its states
    private State off;
    private State idle;
    private State printing;

    private State currentState;

    /**
     * Inits a new Printer with 3 states, and 'off' as initial state
     */
    public Printer() {
        off = new OffState(this);
        idle = new IdleState(this);
        printing = new PrintingState(this);

        // initial state is off
        this.currentState = off;
    }

    /**
     * Returns the current state
     *
     * @return State
     */
    public State getCurrentState() {
        return this.currentState;
    }

    /**
     * Returns the state object of the printer
     *
     * @param String state
     * @return State
     */
    public State getState(String state) {
        if(state.equalsIgnoreCase("off")) return this.off;
        if(state.equalsIgnoreCase("printing")) return this.printing;
        if(state.equalsIgnoreCase("idle")) return this.idle;
        if(state.equalsIgnoreCase("on")) return this.idle;

        return this.getCurrentState();
    }

    /**
     * Changes the state of the printer to the new state
     *
     * @param State state
     */
    public void setState(State state) {
        this.currentState = state;
    }

    /**
     * Turns off the printer
     */
    public void turnOff() {
        this.currentState.turnOff();
    }

    /**
     * Prints the test using this printer
     *
     * @param String text
     */
    public void print(String text) {
        this.currentState.print(text);
    }

    /**
     * Cancels print jobs
     */
    public void cancelPrint() {
        this.currentState.cancelPrint();
    }

    /**
     * Turns the printer on
     */
    public void turnOn() {
        this.currentState.turnOn();
    }
}
