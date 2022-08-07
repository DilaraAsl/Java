package GroupExercises;

import java.util.Scanner;

public class UniqueVowel {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = kb.next();
        System.out.println("Index of the unique no: " + findVowel(str));

    }

    public static int findVowel(String str) {
        String newStr = ""; // will hold the vowels in str
        // find the vowels in str and assign it to newStr
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                newStr += str.charAt(i);
            }
        }
        // find the unique vowels and assign it to uniqueVowel string

        String uniqueVowel = ""; // will create a new string of unique vowels
        for (int i = 0; i < newStr.length(); i++) {
            int counter = 0; // will count the repeated characters
            for (int j = 0; j < newStr.length(); j++) {
                if (newStr.charAt(i) == newStr.charAt(j)) {
                    counter++;
                }

            }
            // if counter == 1 it is a unique vowel
            if (counter == 1) {
                uniqueVowel += newStr.charAt(i);
            }

        }
        // if uniqueVowel is empty there are no unique vowels
        if (uniqueVowel.isEmpty()) return -1;

        // first unique vowel is at index 0 - return its index in the original string str
        return str.indexOf(uniqueVowel.charAt(0));
    }

}
