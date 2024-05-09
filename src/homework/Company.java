package homework;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees = new ArrayList<>();
    private Person manager;

    public void employ(Person p) {
        if (p.position().equals("manager")) {
            this.manager = p;
        } else {
            employees.add(p);
        }
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.employ(new Person("Max", "manager", 34));
        c.employ(new Person("Claire", "manger", 23));

        System.out.println(c.getEmployees());
    }
}
