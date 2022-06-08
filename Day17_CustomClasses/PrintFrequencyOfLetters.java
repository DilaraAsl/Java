package Day17_CustomClasses;

import java.util.Scanner;

public class PrintFrequencyOfLetters {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.next();
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    counter++;
                }
            }
            while(!newString.contains(""+str.charAt(i))){
                newString+=str.charAt(i);
                System.out.print(""+str.charAt(i)+counter+" ");
            }


            }
        System.out.println("Characters in this string: "+newString);
    }
}
