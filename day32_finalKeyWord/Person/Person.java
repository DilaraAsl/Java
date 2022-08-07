package day32_finalKeyWord.Person;

import java.time.LocalDate;

public class Person {
    private String name;
    private final LocalDate dateOfBirth; // When we have a constructor no error
    private final char gender;
    public static final int noOfHead;
    private final int age;

    static {
        noOfHead = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public Person(String name, LocalDate dateOfBirth, char gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        if (gender != 'M' && gender != 'F') {
            System.err.println("invalid gender");
        }
        this.gender = gender;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }

    public void eat() {
    }

    public final void breathe() {
        System.out.println(name + " is breathing...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender + '\''
                ;
    }
}
