package dip.good.example2;

public class Tester implements Employee {
    private String name;

    private Short age;

    public Tester(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public void work() {
        System.out.println("testing everything out there");
    }
}
