package template.BeverageMaker;

public abstract class Beverage {
    /**
     * Makes a new cup of Beverage
     *
     * Steps: Irrespective of the type of Beverage, these steps need to occur.
     * 1. Boil water
     * 2. Brew
     * 3. Pour in cup
     * 4. Add Condiments
     */
    public final void make() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiments();
    }

    // All steps cannot be called outside the class so they are protected
    protected abstract void brew();

    protected abstract void addCondiments();

    // These are private since they cannot be overridden in sub class.
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
