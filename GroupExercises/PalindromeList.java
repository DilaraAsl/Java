package GroupExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeList {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter 10 phrases or words : ");
        String[] list = {kb.nextLine(), kb.nextLine(), kb.nextLine(), kb.nextLine(), kb.nextLine(),
                kb.nextLine(), kb.nextLine(), kb.nextLine(), kb.nextLine(), kb.nextLine()};
        System.out.println(palindromeList(list));
    }

    public static ArrayList<String> palindromeList(String[] list) {
        ArrayList<String> palindromeList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (Palindrome.isPalindrome(list[i])) {
                palindromeList.add(list[i]);
            }

        }
        return palindromeList;
    }


}
