package dip.bad.example2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Developer developer = new Developer("Name 1", (short)33);
        Designer designer = new Designer("Name 2", (short)22);
        Tester tester = new Tester("Name 3", (short)44);

        manager.addDeveloper(developer);
        manager.addDesigner(designer);
        manager.addTester(tester);
    }
}
