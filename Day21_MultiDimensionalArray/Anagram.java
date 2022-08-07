package Day21_MultiDimensionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "heart";
        char[] newStr1 = str1.toCharArray();
        Arrays.sort(newStr1);
        String str2 = "earth";
        char[] newStr2 = str2.toCharArray();
        Arrays.sort(newStr2);
        System.out.println(Arrays.equals(newStr1, newStr2));
        if (Arrays.equals(newStr1, newStr2)) {

            System.out.println("This is an anagram");
        }
    }
}