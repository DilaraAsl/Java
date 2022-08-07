package Day25_ConstructorsAndDateFormatting;

import java.time.LocalDate;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee emp1=new Employee("Jane","Artist", LocalDate.of(1998,10,1),56,120000,'F');
        System.out.println(emp1.toString());
    }
}
