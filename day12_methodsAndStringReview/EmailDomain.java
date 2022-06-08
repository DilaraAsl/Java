package day12_methodsAndStringReview;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter your email address:");
        String email=kb.next().trim();
        printDomain(email);
    }
    public static void printDomain(String domain){
        int length=domain.length();
        String domainName=domain.substring(domain.indexOf("@")+1,length-4);

        System.out.println(domainName);


    }
}
