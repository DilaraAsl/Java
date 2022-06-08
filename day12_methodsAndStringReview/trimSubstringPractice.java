package day12_methodsAndStringReview;

import java.util.Scanner;
public class trimSubstringPractice {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter your email address:");
        String email=kb.next().trim();
        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String account=email.substring(email.indexOf("@")+1);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(account);
        kb.close();
    }
}
