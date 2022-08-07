package day28_Encapsulation.encapsulation;

public class Employee {
    private double salary;
private String name;

    public Employee(double salary, String name) {
        setSalary(salary);
        setName(name);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary cannot be negative "+salary);
            System.exit(1);
        }
        this.salary = salary; // before setting the salary it needs to meet the condition
    }

    public String getName() {
        if (name ==null) {
            return "unknown";
        }

        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()){
            System.err.println(" Employee name cannot be empty or blank ");
            System.exit(1);
        }
        this.name = name;
    }

 // we use getName and getSalary in toString when we only want to print the name and salary which meets the conditions
    public String toString() {
        return "Employee{" +
                "salary=" + getSalary() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
