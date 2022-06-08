package JavaLab_03;

import java.util.Scanner;

public class PizzaAppOzzy {
    public static void main(String[] args) {
        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please login before placing the order");
        System.out.println(login());
        // create three variables named email(string), account number(int),password
        makeOrder(login()); // login returns the email value -make order takes in the email and gives on order no


    }

    private static void makeOrder(String login) {
        for (int i = 0; i <= 0; ) {

            System.out.println("What kind of pizza would you like?(pizza name or special)");
            Scanner kb = new Scanner(System.in);
            String pizzaChoice = kb.next();
            if (checkPizzaThatWeHave(pizzaChoice)) {


                if (pizzaChoice.equalsIgnoreCase("special")) { // special pizza order
                    //build your pizza
                    System.out.println("I am building my own pizza");

                } else { //ready pizza in the system
                    System.out.println("We have received your order. Price is 19.99");


                }
                System.out.println("Your order number is : "+ generateOrderNo(login));
                break;

            } else {
                System.out.println("Invalid pizza Try again");
                continue;
            }


        }


    }

    private static String generateOrderNo(String login) {
       String orderNo="order_";
        for (int i = 0; i <login.length() ; i++) {
            orderNo+=login.substring(i,i+1);
            orderNo+=i;
        }
        return orderNo;
    }

    private static boolean checkPizzaThatWeHave(String pizzaChoice) {
        String pizza1 = "Margarita";
        String pizza2 = "Salami";
        String pizzaSpecial = "Special";
        boolean validPizza =
                pizzaChoice.equalsIgnoreCase(pizza1) ||
                        pizzaChoice.equalsIgnoreCase(pizza2) ||
                        pizzaChoice.equalsIgnoreCase(pizzaSpecial);
        return validPizza;
    }


    public static String login() {
        String email = "mike@gmail.com";
        int accountNo = 123;
        String password = "psw";
        Scanner kb = new Scanner(System.in);
        System.out.println("Please choose your login type. Email: 1, Account: 2");
        int loginType = kb.nextInt();
        for (int i = 3; i > 0; ) {
            // create the selection flow for the login type
            switch (loginType) {
                case 1: // credential check for email and password
                    System.out.println("Enter your email");
                    String givenEmail = kb.next();
                    if (!isInputValid(givenEmail)) {
                        System.out.println("Invalid email. Please try again..");
                        i--;
                        continue;
                    }
                    System.out.println("Please enter your password:");
                    String givenPassword = kb.next();
                    //check if login successful
                    if (email.equals(givenEmail) && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in!!!");
                        break; // end of case 1
                    } else { // invalid checking
                        if (i != 1) {
                            System.out.println("invalid credentials! " + (i - 1) + " chances to try!");
                            i--;
                            continue;
                        } else {
                            System.out.println("Your account is locked-try again tommorow");
                            System.exit(0);//close the execution of jvm
                        }

                    }
                case 2:
                    System.out.println("Please type in your account number");
                    int accNo = kb.nextInt();

                    // invalid and try again
                    if (!isInputValid(accNo)) { // if accNo is out of range
                        System.out.println("invalid account number. Try again!");
                        continue; // goes back to case 2
                    }
                    System.out.println("Please enter your password");
                    givenPassword = kb.next();
                    if ((accNo == accountNo) && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in!!!");
                        break; // end of case 1
                    } else { // invalid checking
                        if (i != 1) {
                            System.out.println("invalid credentials! " + (i - 1) + " chances to try!");
                            i--;
                            continue;
                        } else {
                            System.out.println("Your account is locked-try again tomorrow");
                            System.exit(0);//close the execution of jvm
                        }
                        break;
                    }

            }
            break; // end of loop

        }
        return email;
    }

    private static boolean isInputValid(int accNo) {
        return accNo >= 100 && accNo < 1000;
    }

    private static boolean isInputValid(String givenEmail) {
        //if @. available and "@" is before ""."
        int firstSignOfIndex = givenEmail.indexOf('@');
        int secondSignOfIndex = givenEmail.indexOf('.');
        boolean checkEmail = (secondSignOfIndex < firstSignOfIndex) || (firstSignOfIndex < 0) || (secondSignOfIndex < 0); //invalid conditions
        if (checkEmail) {
            return false;
        }
        return isEmailDomainValid(givenEmail);///?????
    }

    private static boolean isEmailDomainValid(String givenEmail) {
        // check if domain is valid

        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        return checkDomain;
    }
}
