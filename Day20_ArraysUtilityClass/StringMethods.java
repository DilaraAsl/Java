package Day20_ArraysUtilityClass;

import utilities.ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // toCharArray() returns char array
        // split(CharSequence) split the string by given char sequence will return String array
        String str="Cydeo School";
        str=str.replace(" ",""); // remove the space
        char[] charList=str.toCharArray();

        System.out.println(Arrays.toString(charList));

        // split method

        String str2="Today is a great day to learn Java";
        String[] newStr=str2.split(" ");
        System.out.println(Arrays.toString(newStr));
        String[] reverseStr=ArrayUtility.reverse(newStr);
        System.out.println(Arrays.toString(reverseStr));
        String[] str3=str2.split("great");
        System.out.println(Arrays.toString(str3));// great is not included because we used it to split the String -char sequence must be in the string
        String[] arr4=ArrayUtility.reverse(str2.split(" "));

        String reversedSentence="";
        for (int i = 0; i <reverseStr.length ; i++) {
            reversedSentence+=reverseStr[i];

        }
        System.out.println(reversedSentence);
    }
}
