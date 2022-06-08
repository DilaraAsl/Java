package GroupExercises;
import java.util.Scanner;
public class GuessNumberCemil {


        public static void main(String[] args) {

            int targetNumber = (int)(100*Math.random());

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your guess (1~100) :  ");
            int number = input.nextInt();

            while (number != targetNumber) {
                if (number > 100 || number < 1) {
                    System.err.println("your number is out of range, please try again.");
                } else {
                    if (number > targetNumber) {
                        System.out.println("your number is bigger than target number.");
                    } else {
                        System.out.println("your number is smaller than target number.");
                    }
                    System.err.println("Your guess is Not correct, please guess another number.");
                }
                number = input.nextInt();

            }
            System.out.println("Good job.");
        }

    }

