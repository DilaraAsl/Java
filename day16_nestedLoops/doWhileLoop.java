package day16_nestedLoops;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        String username;

        String password;
        int counter=3;

        do{
            System.out.println("Please enter your user name: ");
            username=kb.next();
            System.out.println("Please enter your password :");
            password=kb.next();

            if(username.equals("mike")&& password.equals("psw")) {
                System.out.println("Success!!!");
                break;
            }
            counter--;
            if(counter==0){
                System.err.println("Account locked try again tomorrow");
                System.exit(0);}

        }while(!(username.equalsIgnoreCase("mike")&& password.equalsIgnoreCase("psw")));

        kb.close();
    }
}
