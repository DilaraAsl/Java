package JavaLab_05_Strings;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.next();
        int max = 0;
        char temp = '\0';
        String repeatedChars = "";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;

                }

                if (counter > max) {
                    max = counter;
                    temp = str.charAt(i);
                }
                else if(counter==max){

                }

            }


        }
        System.out.println(" " + temp);
    }


}


