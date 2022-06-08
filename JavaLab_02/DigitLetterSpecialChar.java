package JavaLab_02;
import java.util.Scanner;
import java.lang.String;
public class DigitLetterSpecialChar {
    public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
        System.out.println("please enter a string");
        String word=kb.next();
      // char wordChar=word.charAt(0);

    //if(word.isDigit(0)){
        System.out.println("First Character is digit");
    }

    }
//}
/*  Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
        - if the word starts with digits, print "first character is digit"
                - if the word starts with uppercase letters, print "first character is lowercase letter"
                - if the word starts with lowercase letters, print "first character is uppercase letter"
                - if the word starts with special characters, print "first character is special character"
*/