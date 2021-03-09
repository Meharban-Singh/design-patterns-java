package visitor;

/*
 * Visitor Design patter
 * =======================
 *
 * Use when needed to make some changes to a set of classes, without affecting them.
 * Visits an already defined class structure to make some changes. Like adding bonuses
 * to an already existing Company structure.
 */

public class Driver {
    public static void main(String[] args) {
        // init
        Company company = new Company();
        company.add(new Employee(1,14,100000,"Jill"));
        company.add(new Employee(1,7,100000, "Jack"));

        System.out.println("\nOriginal info for employees");
        company.display();

        // Apply SalaryVisitor
        System.out.println("\nChange in salaries");
        company.accept(new SalaryVisitor());
        company.display();

        // Apply VacationVisitor
        System.out.println("\nChange in vacation time");
        company.accept(new VacationVisitor());
        company.display();
    }
}