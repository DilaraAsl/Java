package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salaryBeforeTax,stateTax, federalTax, totalTax,salaryAfterTax;
        int hourlyRate=50;
        int weeklyHour=45;
        double stateTaxRate=6;
        double federalTaxRate=26;

        salaryBeforeTax = hourlyRate * weeklyHour * 52;
        stateTax=salaryBeforeTax*(stateTaxRate/100);
        federalTax=salaryBeforeTax*(federalTaxRate/100);
        totalTax=federalTax+stateTax;
        salaryAfterTax=salaryBeforeTax-totalTax;
        System.out.println("Gross pay is :$"+salaryBeforeTax);
        System.out.println("State tax is :$"+stateTax);
        System.out.println("Federal tax is :$"+federalTax);
        System.out.println("Total tax is :$"+totalTax);
        System.out.println("Net income is :$"+salaryAfterTax);


    }
}
