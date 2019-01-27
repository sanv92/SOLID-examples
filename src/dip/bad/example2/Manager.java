package dip.bad.example2;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Developer> developers = new ArrayList();

    private List<Designer> designers = new ArrayList();

    private List<Tester> testers = new ArrayList();

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public void addDeveloper(Developer developer) {
        this.developers.add(developer);
    }

    public List<Designer> getDesigners() {
        return designers;
    }

    public void setDesigners(List<Designer> designers) {
        this.designers = designers;
    }

    public void addDesigner(Designer designer) {
        this.designers.add(designer);
    }

    public List<Tester> getTesters() {
        return testers;
    }

    public void setTesters(List<Tester> testers) {
        this.testers = testers;
    }

    public void addTester(Tester tester) {
        this.testers.add(tester);
    }
}
