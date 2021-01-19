package decorator;

/*
 * Decorator Design patter
 * =======================
 *
 * A beverage can be decorated with any number of add-ons => Milk, Espresso and Mocha.
 * We achieve this with a HAS-A relationship => A beverage HAS-A CondimentDecorator.
 * This can be seen as a recursive relationship. A condiment decorator can have another
 * condiment decorator which can have another ... and so on until it has a beverage.
 *
 * This is sort of similar to composite, but the HAS-A relationship is one to one instead
 * of one to many.
 */
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
