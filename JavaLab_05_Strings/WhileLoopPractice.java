package JavaLab_05_Strings;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Would you like to continue yes/no" );
        String ans=kb.nextLine();
        while(!(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("now"))){
            System.err.println("invalid entry");
            System.out.println("Would you like to continue yes/no" );
            ans=kb.nextLine();

        }

    }
}
