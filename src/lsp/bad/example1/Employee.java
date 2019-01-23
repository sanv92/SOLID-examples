package lsp.bad.example1;

public abstract class Employee
{
    public String getWorkDetails(Integer employeeId) {
        return "Base Work";
    }

    public String getEmployeeDetails(Integer employeeId) {
        return "Base Employee";
    }
}