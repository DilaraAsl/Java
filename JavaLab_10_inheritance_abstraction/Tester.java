package JavaLab_10_inheritance_abstraction;

public final class Tester extends Employee implements WFH {
    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the code.");

    }

    public void createTicket() {
        System.out.println("Ticket is created.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void workFromHome() {
        System.out.println(getName() + " is testing from home");
    }
}
