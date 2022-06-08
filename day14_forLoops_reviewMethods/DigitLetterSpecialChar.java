package day14_forLoops_reviewMethods;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
       String strDigit="";
       String strLetter="";
       String strSp="";
        for (int i = 0; i <str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                strDigit+=""+str.charAt(i);
            }
            else if(Character.isLetter(str.charAt(i))){
                strLetter+=str.charAt(i);

            }
            else strSp+=str.charAt(i);

        }
        System.out.println("digits: "+strDigit);
        System.out.println("letters: "+strLetter);
        System.out.println("special chars: "+strSp);
    }
}
