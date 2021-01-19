package decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    /**
     * Creates a new Mocha object with a beverage
     *
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Returns description of the Mocha drink
     *
     * @return String
     */
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * Returns cost of the Mocha drink
     *
     * @return double
     */
    public double cost() {
        return .20 + beverage.cost();
    }
}