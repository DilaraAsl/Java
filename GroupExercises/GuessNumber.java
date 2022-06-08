package GroupExercises;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100);
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number between 1-100: ");
        int number = kb.nextInt();
        while (number > 0 && number < 101) {

            if (number == targetNumber) {
                System.out.println("Congrats!");
                break;
            }
            else{
            while (number != targetNumber) {

                if (number < targetNumber) {
                    System.err.println("Your number is smaller ");
                    System.out.println("Please enter another number");
                    number = kb.nextInt();
                } else {
                    System.err.println("Your number is bigger ");
                    System.out.println("Please enter another number");
                    number = kb.nextInt();
                }

            }
            }
        }
    }
}
