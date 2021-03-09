package visitor;

public interface Visitor {
    /**
     * Visits an Employee and makes some changes
     *
     * @param e Employee to visit
     */
    void visit(Employee e);
}