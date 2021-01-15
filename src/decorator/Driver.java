package decorator;

public class Driver {
    public static void main(String args[]) {
        // Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Double Mocha Dark Roast
        Beverage beverage2 = new Mocha(new Mocha(new DarkRoast()));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // Triple Milk Espresso Mocha
        Beverage beverage3 = new Mocha(new Milk(new Milk(new Milk(new Espresso()))));
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
