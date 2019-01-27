package dip.good.example2;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Employee> employees = new ArrayList();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
