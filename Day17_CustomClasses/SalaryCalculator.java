package Day17_CustomClasses;

public class SalaryCalculator{
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRAte, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRAte;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }


    public String toString() {
        return "SalaryCalculatorTester{" +
                "hourlyRAte=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
    public double salary(){
        double salaryT=this.hourlyRate*this.weeklyHours*52;
        return salaryT;
    }
    public double stateTax(){

        double stateTax=this.salary()*(this.stateTaxRate/100.0);
        return stateTax;
    }
    public double federalTax(){
        double fedTax=this.salary()*(this.federalTaxRate/100.0);
        return fedTax;
    }
    public double salaryNet(){
        double netSal=this.salary()-this.stateTax()-this.federalTax();
        return netSal;
    }

}
