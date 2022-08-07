package Day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {
    public Teacher(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    public void teach() {
        System.out.println(getName() + " is teaching now.");
    }
}
