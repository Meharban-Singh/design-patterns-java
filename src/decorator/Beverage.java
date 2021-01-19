package decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    /**
     * Returns the description of the drink
     *
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the cost of the drink
     *
     * @return double
     */
    public abstract double cost();
}
