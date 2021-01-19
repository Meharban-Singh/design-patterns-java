package decorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    /**
     * Creates a new Milk object with beverage as base
     *
     * @param beverage
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Returns the description of the object
     *
     * @return String
     */
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * Returns the cost of the Milk drink
     *
     * @return double
     */
    public double cost() {
        return .10 + beverage.cost();
    }
}