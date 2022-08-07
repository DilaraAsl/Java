package day32_finalKeyWord.Person;

import java.time.LocalDate;

public class Employee extends Person {
    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Employee(String name, String jobTitle, LocalDate dateOfBirth, char gender, double salary) {
        super(name, dateOfBirth, gender);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return super.toString() + "Job Title " + jobTitle + " Salary: " + salary;
    }
}
