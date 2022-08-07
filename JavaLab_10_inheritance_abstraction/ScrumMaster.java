package JavaLab_10_inheritance_abstraction;

public class ScrumMaster extends Employee {
    public ScrumMaster(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "ScrumMaster", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is scheduling a meeting.");

    }

    public void coaching() {
        System.out.println(getName() + " is coaching.");
    }
}
