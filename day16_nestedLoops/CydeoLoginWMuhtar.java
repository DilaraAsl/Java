package day16_nestedLoops;

import java.util.Scanner;

public class CydeoLoginWMuhtar {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = kb.next();

        System.out.println("Enter your password");
        String password = kb.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("You are logged in");
        } else {

            for (int i = 0; i <3; i++) {
                System.err.println("Incorrect username or password. Please try again. ");

                System.out.println("Enter your username");
                username = kb.next();

                System.out.println("Enter your password");
                password = kb.next();

                if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                    System.out.println("You are logged in");
                    break;
                }
            }
                if (!(username.equals("Cydeo") && password.equals("Cydeo123"))) {
                    System.err.println("Your account is locked. Please contact the support team");
                    kb.close();
                    System.exit(0);
                }
            }
        }

    }
