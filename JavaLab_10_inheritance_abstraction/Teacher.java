package JavaLab_10_inheritance_abstraction;

public final class Teacher extends Employee implements WFH {

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void workFromHome() {
        System.out.println(getName() + " is working from home");
    }

    public void work() {
        System.out.println(getName() + " is teaching.");

    }
}
