package chainOfResponsibility;

public class TensHandler extends CurrencyHandler{

    public boolean dispense(double amount) {
        // Calc number of bills needed , if bills needed are more than currect cap, then use max number of bills the handler has,
        int bills = (int) Math.floor(amount / 10);
        if(bills > super.numBills) bills = super.numBills;

        // If there is a successor in the COR pipeline, dispense the remaining amount from it.
        if(super.successor != null) {
            // If the amount is equal to numBills * value or if successor returns true, update the capacity of the handler and return true to preccessor.
            if(amount == bills * 10 || super.successor.dispense(amount - (bills * 10))) {
                super.numBills = super.numBills - bills;
                System.out.println("Tens: " + bills);
                return true;
            }
        }

        // Something wrong, no successor in the pipeline.
        return false;
    }
}