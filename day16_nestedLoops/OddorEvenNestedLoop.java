package day16_nestedLoops;

import java.util.Scanner;

public class OddorEvenNestedLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String ans = "yes";

        while (ans.equals("yes")) {

            System.out.println("please enter a number");
            int number = kb.nextInt();

            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("would you like to enter another number? yes or no");
            ans = kb.next();
            while (!(ans.equalsIgnoreCase("yes") || (ans.equalsIgnoreCase("no")))) {
                System.err.println("Invalid entry");
                ans = kb.next();
            }


        }
        kb.close();
    }
}
