package visitor;

public class VacationVisitor implements Visitor {
    public void visit(Employee e) {
        e.setVacationDays(e.getVacationDays()+7);
    }
}