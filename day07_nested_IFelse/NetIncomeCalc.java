package day07_nested_IFelse;

public class NetIncomeCalc {

    public static void main(String[] args) {
        double salary = 115000;
        double netIncome;
        double taxrate = 0.0;
        boolean married = true;
        if (salary >= 130000) {
            taxrate = 0.30;
        }
        else if (salary <= 129000 && salary >= 100000) {
            taxrate = 0.25;
        }
        else if (salary <= 99000 && salary >= 80000) {
            taxrate = 0.20;
        }
        else {
            taxrate = 0.15;
        }
        if (married) {taxrate = taxrate-0.05;}
        netIncome = salary-(salary * taxrate);
        System.out.println(taxrate);
        System.out.println("This is the net income: " + netIncome);
    }
}



/*  Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                    if the person is married, he/she will pay 5% less tax*/