package Day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;


public class Person {
    private String name;
    private int age;
    private LocalDate DOB;

    public Person(String name, LocalDate DOB) {
        setName(name);
        setDOB(DOB);
        setAge(LocalDate.now().getYear() - DOB.getYear());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("invalid age :" + age);
            System.exit(1);
        }
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        if (DOB.isAfter(LocalDate.now())) {
            System.out.println("invalid Date of Birth");
        }
        this.DOB = DOB;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DOB=" + DOB + " ";
    }
}
