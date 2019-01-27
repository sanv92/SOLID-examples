package dip.good.example2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.addEmployee(new Developer("Name 1", (short)33));
        manager.addEmployee(new Designer("Name 2", (short)22));
        manager.addEmployee(new Tester("Name 3", (short)44));

        for (Employee employee : manager.getEmployees()) {
            employee.work();
        }
    }
}
