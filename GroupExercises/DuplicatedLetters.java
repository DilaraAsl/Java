package GroupExercises;

import java.util.Scanner;

public class DuplicatedLetters {
    public static void main(String[] args) {
// abcde - 0 no characters repeated
// aabBcde -2 a occurs twic and b B twice
        // indivisiblity 1 i occurs six times

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.next();
        findDuplicate(str);
    }

    public static void findDuplicate(String str) {
        String[] temp = new String[str.length()];
        temp = str.split(""); // {a,A,a,d}

        String duplicates = "";


        for (String i : temp) { //b
            int counter = 0;
            for (String j : temp) { //a b
                if (i.equalsIgnoreCase(j)) {
                    counter++;
                }

            }
            if (counter > 1 && !(duplicates.toLowerCase().contains(i.toLowerCase()))) {

                duplicates += i;


                //System.out.println(i+" occurs "+counter+" times");
            }

        }
        System.out.println("Total duplicates: " + duplicates.length());

    }
}
