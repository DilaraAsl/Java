package JavaLab_10_inheritance_abstraction;

public class Developer extends Employee implements WFH {
    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void fixBug() {
        System.out.println(getName() + " is fixing bugs.");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is developing code.");
    }

    @Override
    public String toString() {
        fixBug();
        work();
        return super.toString();
    }

    @Override
    public void workFromHome() {
        System.out.println(getName() + " is working from home.");
    }
}
