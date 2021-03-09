package visitor;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public void display() {
        System.out.println(employees);
    }

    public void accept(Visitor v) {
        for (Employee e: employees){
            e.accept(v);
        }
    }
}