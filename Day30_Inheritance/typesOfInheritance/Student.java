package Day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person {
    public Student(String name, LocalDate DOB) {
        super(name, DOB);
    }

    public void study() {
        System.out.println(getName() + " is studying now.");
    }
}
