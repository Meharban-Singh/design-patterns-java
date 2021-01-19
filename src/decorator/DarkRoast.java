package decorator;

public class DarkRoast extends Beverage {
    /**
     * Creates a new Dark Roast object
     */
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    /**
     * Returns the cost of the drink
     *
     * @return double
     */
    public double cost() {
        return .99;
    }
}