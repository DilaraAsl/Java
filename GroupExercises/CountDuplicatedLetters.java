package GroupExercises;

import java.util.Scanner;

public class CountDuplicatedLetters {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.next();
        getNumber(str);
    }

    private static int getNumber(String str) {
        str = str.toLowerCase();
        String temp = "";
        String output = "";
        for (char ch : str.toCharArray()) {
            if (!temp.contains(ch + "")) { // Eliminate the first appearance here
                temp += ch;
            } else if (!output.contains(ch + "")) //second appearance will be recorded here
                output += ch;
        }
        System.out.println(temp);
        System.out.println(output);
        return output.length();
    }
}
