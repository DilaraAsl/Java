package day33_abstraction.EmployeeTask;

public class Mentor extends Teacher {
    public Mentor(String name, int age, char gender, String id) {
        super(name, age, gender, id, "Student", 0.0);

    }

    @Override
    public void work() {
        System.out.println(getName() + " is studying now!!");
    }
}
