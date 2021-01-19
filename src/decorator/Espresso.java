package decorator;

public class Espresso extends Beverage {

    /**
     * Creates a new Espresso object
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * Returns cost of Espresso drink
     *
     * @return double
     */
    public double cost() {
        return 1.99;
    }
}