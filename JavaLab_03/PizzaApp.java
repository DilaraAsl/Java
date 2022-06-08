package JavaLab_03;

import java.util.Scanner;

public class PizzaApp {
    /*
    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Pizza!");
        System.out.println("Please login before placing your order");
        makeOrder(login()); // run makeOrder method if login() is valid - passes email as an argument to makeOrder
    }

    private static void makeOrder(String email) {

    }

   public static String login() {

        String email = "mike@gmail.com";
        int accountNo = 123; //account number can be in between 100 and 1000
        String password = "psw";

        // ask customer if he wants to log in with email or account no

        Scanner kb = new Scanner(System.in);

        System.out.println("Please choose your log in type email :1 account no: 2 ");
        int loginType = kb.nextInt();

        for (int i = 0; i < 3; ) {
            // create the selection flow for the login type

            switch (loginType) {

                case 1: // email as log in type
                {
                    // input email
                    System.out.println("Please enter your email: ");
                    String inputEmail = kb.next();


                    if (!isInputValid(inputEmail)) {
                        System.err.println("Invalid email. Try again!!!");
                        continue;
                    }
                    // input password
                    System.out.println("Please enter your password: ");
                    String inputPass = kb.next();

                    //check if log in is successful

                    if (inputEmail.equalsIgnoreCase(email) && inputPass.equalsIgnoreCase(password)) {
                        System.out.println("Login Successful!!!");
                        break;
                    } else { // invalid entry try three times
                        if (i != 2) {
                            System.out.println("Invalid credentials!! " + (3 - i) + " chances left to try");
                            continue;
                        } else {
                            System.out.println("Your account is locked -try again tomorrow");
                            System.exit(0);
                        }
                    }


                }

                case 2: // account no as log in type
                {
                    System.out.println("Please type in your account number :");
                    int accNo=kb.nextInt();
                    if(!isInputValid(accNo)){
                        System.err.println("Invalid account number. Try again!!!");
                        continue;

                    }
                    System.out.println("Please enter your password :");
                    String inputAccPass=kb.next();

                    if(accNo==accountNo&& inputAccPass.equals(password)){
                        System.out.println("Successful login!");
                    }
                    else{
                        if (i != 2) {
                            System.out.println("Invalid credentials!! " + (3 - i) + " chances left to try");
                            continue;
                        } else {
                            System.out.println("Your account is locked -try again tomorrow");
                            System.exit(0);
                        }

                    }


                }
                default:
                    System.err.println("Invalid Entry");
                    System.exit(0);
            }


        }


        return email;
    }

    private static boolean isInputValid(String inputEmail) {
        int firstPosition = inputEmail.indexOf('@');
        int secondPosition = inputEmail.indexOf('.');
        boolean checkEmail = firstPosition > secondPosition || firstPosition < 0 || secondPosition < 0;
        if (checkEmail) return false;
        return isEmailDomainValid(inputEmail);
    }
    private static boolean isInputValid(int accNo) {

        boolean checkAccNo=accNo>=100&&accNo<1000;

        return checkAccNo;
    }

    private static boolean isEmailDomainValid(String inputEmail) {
        String domain = inputEmail.substring(inputEmail.indexOf('@') + 1, inputEmail.indexOf('.');
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");
        return checkDomain;
    }
}//*/
}
