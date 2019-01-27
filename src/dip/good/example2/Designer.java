package dip.good.example2;

public class Designer implements Employee {
    private String name;

    private Short age;

    public Designer(String name, Short age) {
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
        System.out.println("turning lines to wireframes");
    }
}
