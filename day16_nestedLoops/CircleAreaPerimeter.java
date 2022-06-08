package day16_nestedLoops;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        inputUser();
    }

    private static void inputUser() {
        Scanner kb = new Scanner(System.in);

        String ans = "yes";

        while (ans.equalsIgnoreCase("yes")) {

            System.out.println("Please enter the diameter :");
            double diameter = kb.nextDouble();
            if (isvalidEntry(diameter)) {
                System.out.printf("%.2f", areaC(diameter));
                System.out.println();
                System.out.printf("%.2f", perimeterC(diameter));
                System.out.println();

            }
            System.out.println("Would you like to continue? yes or no");
            ans = kb.next();



            while (!(ans.equalsIgnoreCase("yes")))
            {
                if (ans.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for using this app");
                    break;
                } else {
                    System.err.println("Invalid entry, try again!!!");
                    System.out.println("Would you like to continue? yes or no");
                    ans = kb.next();
                }
            }
        }
        kb.close();


    }




    private static double perimeterC(double diameter) {
        double perimeter = diameter * 3.14;
        return perimeter;
    }

    private static double areaC(double diameter) {
        double area = (diameter / 2.0) * 3.14;
        return area;
    }

    private static boolean isvalidEntry(double diameter) {
        if (diameter <= 0) return false;
        return true;
    }

}
