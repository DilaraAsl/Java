package XtraTasks.leetCode.Easy;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a roman numeral");
        System.out.println(romanToInt(kb));

    }

    public static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -1;
    }

    public static int romanToInt(Scanner kb) {
        char[] romanList = kb.next().toCharArray();
        int sum = 0;
        for (int i = 0; i < romanList.length; i++) {

            if (i + 1 < romanList.length) { // prevents out of bounds exception error
                if (value(romanList[i]) >= value(romanList[i + 1])) // if first character is greater than the next add the character to the total
                    sum += value(romanList[i]);
                else {
                    sum -= value(romanList[i]); // if first character is smaller (such as IV ) subtract the first, next loop will add the second

                }
            } else sum += value(romanList[i]); // adds the last value to the sum
        }
        return sum;
    }
}
