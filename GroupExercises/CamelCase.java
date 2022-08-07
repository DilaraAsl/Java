package GroupExercises;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a camel case expression: ");
        System.out.println(breakCamelCase(kb.next()));
    }

    public static String breakCamelCase(String str) {
        if (str.isEmpty() || str.isBlank() || str.equals("")) return "";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 65 && str.charAt(i) <= 90)) { // ASCII upper case letters are in the range of 65 and 90
                newStr += str.charAt(i);                         //if it is not an upper chase character add it to new string
            } else {
                newStr += " " + str.charAt(i);
            }

        }
        return newStr;
    }

}
