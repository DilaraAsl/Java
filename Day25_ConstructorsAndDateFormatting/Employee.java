package Day25_ConstructorsAndDateFormatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    public String name,jobTitle;
     public LocalDate hireDate;
    public int age;
    public double salary;
    public char gender;

    public Employee(String name, String jobTitle, LocalDate hireDate, int age, double salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }


    public String toString() { // allows us to print the fields of the object when called by print method
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hireDate=" + hireDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
