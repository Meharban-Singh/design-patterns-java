package observer.pushBasedObserver;

public class DataSource extends Subject {
    private int value;

    public DataSource(int value) {
        this.value = value;
    }

    /**
     * Returns the value
     * @return
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Updates the value and informs all observers.
     *
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
        super.notifyObservers(value);
    }
}
