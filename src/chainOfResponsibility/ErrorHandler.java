package chainOfResponsibility;

public class ErrorHandler extends CurrencyHandler {
    public boolean dispense(double amount) {
        // If we reach here, return false.
        System.out.println("Invalid Amount. Transaction cancelled!");
        return false;
    }
}