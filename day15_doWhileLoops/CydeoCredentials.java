package day15_doWhileLoops;

import java.util.Scanner;

public class CydeoCredentials {
   public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);

        System.out.println("Enter your username");
        String username=kb.next();

        System.out.println("Enter your password");
        String password=kb.next();
        int i=0;
        if (!username.equals("Cydeo")||!password.equals("Cydeo123")){
            while(i<3){
                if (i!=2 && !((username.equals("Cydeo")&&password.equals("Cydeo123")))){
                System.out.println("Enter your credentials again");
                System.out.println("Enter your username");
                username=kb.next();
                System.out.println("Enter your password");
                password=kb.next();
                i++;
                }
                else {System.out.println("You are logged in!"); break;}
                if (i==2 && (!username.equals("Cydeo")||!password.equals("Cydeo123")))
                { System.out.println("Your account is locked");
                break;}

            }

        }

        else System.out.println("You are logged in!");
}
}
