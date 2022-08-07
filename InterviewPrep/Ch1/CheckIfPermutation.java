package InterviewPrep.Ch1;

import java.util.*;

import static java.util.Arrays.*;

public class CheckIfPermutation {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a string :");
        String str1 = orderStr(kb.next());
        System.out.println("Please enter another string :");
        String str2 = orderStr(kb.next());
        if (str1.equals(str2)) System.out.println("Two strings are permutations! ");
        else System.err.println("Not a permutation!");
    }

    public static String orderStr(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
        String newStr = String.valueOf(letters); // converts char array letters to String
        System.out.println(newStr);
    /* ArrayList<String> charList = new ArrayList<>(Arrays.asList(letters));// Arrays.asList accepts only non primitive types

        Collections.sort(charList);
        String newStr="";
        for (String  character : charList) {
            newStr+=""+character;
        }*/
        return newStr;
    }
}
