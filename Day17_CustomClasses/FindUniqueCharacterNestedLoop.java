package Day17_CustomClasses;

import java.util.Scanner;

public class FindUniqueCharacterNestedLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.next();
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 1) {

                newString += str.charAt(i);

            }

        }
        System.out.println("****");
        System.out.println(newString);
    }
}
