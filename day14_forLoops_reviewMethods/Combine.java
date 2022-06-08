package day14_forLoops_reviewMethods;
import java.util.*;
public class Combine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = keyboard.next();
        String word2 = keyboard.next();
        String result = combineWords(word1, word2);
        System.out.println(result);
        result=combineWordsEndsWith(word1,word2);
        System.out.println(result);
        keyboard.close();
boolean output=word1.contains("as");
        System.out.println(output);
    }

    public static String combineWords(String w1, String w2) {
        int l1 = w1.length();
        String newWord = w1 + w2;
        if (w1.charAt(l1 - 1) == (w2.charAt(0)))
            newWord = w1 + w2.substring(1);
        return newWord;
    }

    public static String combineWordsEndsWith(String w1, String w2) {
        String newWord=w1+w2;
        if(w1.endsWith(w2.charAt(0)+"")) //endsWith method pass a String to convert it to a string add ""
        {
            newWord=w1+w2.substring(1);

        }
        return newWord;
      }
}
