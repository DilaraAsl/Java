package JavaLab_10_inheritance_abstraction;

public class BusinessAnalyst extends Employee implements ScrumMember, WFH {
    public BusinessAnalyst(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void workFromHome() {

    }

    public void analyze() {
        System.out.println(getName() + " is analyzing the data.");
    }
}
