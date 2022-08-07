package XtraTasks.LiangCh10_2;

import java.time.LocalDate;

public class Employee extends Person {
    private LocalDate dateHired;
    private double salary;
    private boolean hasOffice;

    public Employee(String name, String address, String email, LocalDate dateHired, double salary, boolean hasOffice) {
        super(name, address, email);
        setDateHired(dateHired);
        setSalary(salary);
        setHasOffice(hasOffice);
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHasOffice() {
        return hasOffice;
    }

    public void setHasOffice(boolean hasOffice) {
        this.hasOffice = hasOffice;
    }

    @Override
    public String toString() {
        return super.toString() +
                " dateHired=" + dateHired +
                ", salary=" + salary +
                ", hasOffice=" + hasOffice;
    }
}
