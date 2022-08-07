package GroupExercises;

import java.util.Scanner;

public class JadenCasingStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(convertStrings(str));

    }

    private static String convertStrings(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }


        String[] temp = str.split(" "); // splits the string by space

        String finalStr = "";

        for (String each : temp) {
            finalStr = (each.charAt(0) + "").toUpperCase() + each.substring(1);// each.charAt(0) returns a char +"" makes it a String

        }

        return finalStr;
    }
}
