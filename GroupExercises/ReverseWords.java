package GroupExercises;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        System.out.println(reverseWords(kb.nextLine()));
    }

    private static String reverseWords(String str) {
        //str.trim();
        String[] strArray = str.split(" ");
        String reverseStr = "";

        for (int i = strArray.length - 1; i >= 0; i--) {

            reverseStr += strArray[i];
            reverseStr = reverseStr.trim() + " ";
        }
        return reverseStr;
    }
}
