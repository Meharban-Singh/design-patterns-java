package chainOfResponsibility;

/*
 * Chain Of Responsibility Design patter
 * ====================================
 *
 * Used when we need create a pipeline. So something like send data to 1 object, then to second etc.
 *
 * Example:
 * Consider sending a HTTP request to the serve. Then, you need to send data to some middlewares before
 * the request reaches the destination. So each of those middlewares are part of a pipeline.
 *
 * In this example, we are sending data to a ATM currency handler which processes its resources and sends
 * the data to next part of the pipeline etc.
 */

public class Driver {
    public static void main(String[] args) {
        // Init a bank
        ATM atm = new ATM();


        // Create all handlers, and set their capacities
        //----------------------------------------------------
        CurrencyHandler fifties = new FiftiesHandler();
        fifties.setNumberOfBills(10);

        CurrencyHandler twenties = new TwentiesHandler();
        twenties.setNumberOfBills(10);

        CurrencyHandler tens = new TensHandler();
        tens.setNumberOfBills(100);

        CurrencyHandler error = new ErrorHandler();
        //----------------------------------------------------


        // Init COR pipleline
        //----------------------------------------------------
        fifties.setSuccessor(twenties);
        twenties.setSuccessor(tens);
        tens.setSuccessor(error);

        atm.setHandler(fifties);
        //----------------------------------------------------


        // TEST CASES
        //----------------------------------------------------
        System.out.println("Dispense $280 - should be legal");
        atm.dispense(280);
        System.out.println();

        System.out.println("Dispense $10 - should be legal");
        atm.dispense(10);
        System.out.println();

        System.out.println("Dispense $15 - illegal since not a multiple of any currency denominations");
        atm.dispense(15);
        System.out.println();

        System.out.println("Dispense $1000 - legal: should NOT use 10 fifties since 5 of them were dispensed before");
        atm.dispense(1000);
        System.out.println();

        System.out.println("Dispense $2000 - illegal since greater than capacity");
        atm.dispense(2000);
        System.out.println();

        System.out.println("Dispense $50 - legal, should use 10s since 20s are exhausted");
        atm.dispense(50);
        System.out.println();

        System.out.println("Dispense $500 - illegal since greater than current capacity (current cap = 360)");
        atm.dispense(500);
        System.out.println();

        System.out.println("Dispense $123 - illegal, not a multiple of 10, 20 or 50");
        atm.dispense(123);
        System.out.println();

        System.out.println("Dispense $470  - illegal since greater than current capacity (current cap = 360)");
        atm.dispense(470);
        System.out.println();

        System.out.println("Dispense $360 - legal, ATM should be empty after this");
        atm.dispense(360);
        System.out.println();

        System.out.println("ATM should be empty now. Lets withdraw $10");

        System.out.println("Dispense $10  - illegal since greater than current capacity (current cap = 0)");
        atm.dispense(10);
        System.out.println();
        //----------------------------------------------------
    }
}
