package GroupExercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a word or a sentence to check if it is a palindrome : ");
        String str = kb.nextLine();
        System.out.println(isPalindrome(str));


    }

    public static boolean isPalindrome(String str) {
        if (str.isEmpty() || str.equals(null)) {
            return false;
        }
        str = str.toLowerCase();
        str = str.trim();
        str = str.replace(" ", "");
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        if (str.equals(reverse)) return true;
        return false;
    }

}
