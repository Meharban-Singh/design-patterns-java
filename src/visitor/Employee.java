package visitor;

public class Employee {
    private int id;
    private int vacationDays;
    private String name;
    private int salary;

    public Employee(int i, int v, int s, String n) {
        id=i;
        vacationDays=v;
        name = n;
        salary = s;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public void setVacationDays(int v) {
        vacationDays = v;
    }

    public void setSalary(int s) {
        salary=s;
    }

    public String toString() {
        return "Employee: id="+id+ " name="+name+" days="+vacationDays+" salary="+salary;
    }

    public void accept (Visitor v) {
        v.visit(this);
    }
}