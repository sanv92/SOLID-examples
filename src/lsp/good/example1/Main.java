package lsp.good.example1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IEmployee> list = new ArrayList<>();

        list.add(new JuniorEmployee());
        list.add(new SeniorEmployee());

        for (IEmployee emp : list) {
            emp.getEmployeeDetails(985);
        }
    }
}
