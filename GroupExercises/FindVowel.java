package GroupExercises;

import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = kb.next();

        String newStr = ""; // will hold the vowels in str
        // find the vowels in str and assign it to newStr
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                newStr += str.charAt(j);
            }
        }
        // find the first unique vowel
        // will count the repeated characters
        String uniqueVowel = ""; // will create a new string of unique vowels
        for (int i = 0; i < newStr.length(); i++) {
            int counter = 0;
            for (int j = 0; j < newStr.length(); j++) {
                if (newStr.charAt(i) == newStr.charAt(j)) {
                    counter++;
                }


            }
            if (counter == 1) {
                uniqueVowel += newStr.charAt(i);
            }
        }

        System.out.println(newStr);
        System.out.println(uniqueVowel);

    }

}

