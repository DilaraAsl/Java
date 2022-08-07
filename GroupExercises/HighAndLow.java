package GroupExercises;

import java.util.Scanner;

public class HighAndLow {
    /*
    Highest and Lowest Num From String

You are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

     */

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println(highAndLow(kb.nextLine()));
    }

    private static String highAndLow(String str) {
        String[] numberArr = str.split(" ");
        int max = Integer.parseInt(numberArr[0]);
        int min = Integer.parseInt(numberArr[0]);
        for (String each : numberArr) {
            if (Integer.parseInt(each) > max)
                max = Integer.parseInt(each);
            if (Integer.parseInt(each) < min)
                min = Integer.parseInt(each);
        }
        return "" + max + " " + min;
    }
}
