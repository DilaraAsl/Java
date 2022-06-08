package Day17_CustomClasses;

public class SalaryCalculatorTester {
    public static void main(String[] args) {
        SalaryCalculator emp1=new SalaryCalculator(45,10,6,35);
        System.out.println(emp1.toString());
        System.out.println("Salary "+emp1.salary());
        System.out.println("Net Salary "+emp1.salaryNet());
    }
}
