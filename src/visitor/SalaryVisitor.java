package visitor;

public class SalaryVisitor implements Visitor {
    public void visit(Employee e) {
        e.setSalary(e.getSalary()+1000);
    }
}