package lsp.bad.example1;

public class SeniorEmployee extends Employee {
    @Override
    public String getWorkDetails(Integer employeeId) {
        return "Senior Work";
    }

    @Override
    public String getEmployeeDetails(Integer employeeId) {
        return "Senior Employee";
    }
}