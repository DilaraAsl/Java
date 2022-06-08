package Day18_GarbageCollection;

import java.util.Scanner;

public class HighestFrequency {
   public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        String str =kb.next();
        int max = 0; // will hold the max frequency of a character
        String finalStr = "";

        for (int i = 0; i < str.length(); i++) {
            int counter = 0; // counter will check the accurance of char(i) & at end of  each iteration will set to 0
            for (int j = 0; j < str.length(); j++) { //
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }

            } // inner loop ends
            if (counter > max) { // check the counter if it is greater than max
                max = counter;
                finalStr = str.charAt(i) + "";
            }
            else if (counter == max && !finalStr.contains(str.charAt(i) + "")) {
                finalStr += str.charAt(i) + "";


            }
        }
        System.out.println(finalStr);

    }

}
