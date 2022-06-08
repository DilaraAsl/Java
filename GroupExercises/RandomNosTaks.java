package GroupExercises;

import java.util.Scanner;

public class RandomNosTaks {
    public static void main(String[] args) {

        boolean ans = true;
        Scanner kb = new Scanner(System.in);
        String str="yes";

        while (ans) {
            int no1 = (int) (Math.random() * 100);
            int no2 = (int) (Math.random() * 100);
            System.out.println("No 1: "+no1);
            System.out.println("No 2:"+no2);
            System.out.println("What is the total? ");
            int input = kb.nextInt();

            if (input == no1 + no2) {System.out.println("Good job!");
                ans=false;
            }
            else {

                while(input!=no1+no2){
                    System.out.println("try again!");
                    input=kb.nextInt();
                }


            }
        }
    }
}
