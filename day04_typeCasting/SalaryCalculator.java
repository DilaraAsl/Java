package day04_typeCasting;

public class SalaryCalculator {
    public static void main(String[] args) {
        String name="Joshua";
        int hourlyRate=40;
        int weeklyHours=45;
        int salary=hourlyRate*weeklyHours*52;
        System.out.println(name+", your salary is $"+salary);
    }
}
