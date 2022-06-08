package day16_nestedLoops;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        calculateOrNot();
        System.out.println("Nice working with you!");

    }

    private static void calculateOrNot() {

        Scanner kb = new Scanner(System.in);
        String ans = "yes";



        while (ans.equalsIgnoreCase("yes")) {
            System.out.println(inputData());
            System.out.println("Would you like to continue? yes or no ");
            ans = kb.next();
            while (!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry");
                System.out.println("Would you like to continue ? yes or no ");
                ans=kb.next();
            }

        }}

    private static double inputData() {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter two numbers:");
        double no1 = kb.nextDouble();
        double no2 = kb.nextDouble();
        System.out.println("enter + - / * ");
        String operator = kb.next();
        return calculator(no1,no2,operator );


    }

    public static double calculator(double no1, double no2, String operator) {
        double result = 0;
        switch (operator) {

            case "+":
                result = no1 + no2;
                break;
            case "-":
                result = no1 - no2;
                break;
            case "*":
                result = no1 * no2;
                break;
            case "/":
                result = no1 / no2;
                break;

            default:
                System.err.println("invalid operator! Try again! :");


        }

        return result;
    }
}


