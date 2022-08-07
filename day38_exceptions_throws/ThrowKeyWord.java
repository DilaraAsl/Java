package day38_exceptions_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        if (age < 0 || age > 100) {

            throw new InputMismatchException("Age of the person cannot be negative or greater than 100 =>>> " + age);
        }
    }
}
