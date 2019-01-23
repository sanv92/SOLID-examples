package lsp.good.example1;

public class SeniorEmployee implements IWork, IEmployee {
    public String getWorkDetails(Integer employeeId) {
        return "Senior Work";
    }

    public String getEmployeeDetails(Integer employeeId) {
        return "Senior Employee";
    }
}