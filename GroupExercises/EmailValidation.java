package GroupExercises;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter your email: ");
        String email=kb.next();
        System.out.println(isEmailValid(email));

    }
    public static boolean isEmailValid(String email){
        if(Character.isLetter(email.charAt(0))&& email.contains("@")&&email.contains(".")&&(email.indexOf('@') < email.lastIndexOf('.')&&(email.indexOf('@')==(email.lastIndexOf('@'))))){
            return true;
        }

        return false;
    }
}
