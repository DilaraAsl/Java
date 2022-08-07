package Day23_Collections;

import java.util.ArrayList;

public class LunchExercise {
    public static void main(String[] args) {
       /* Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"

        output:
        list1: {1, 2, 3, 4, 5, 6}
        list2: {A, B, C, D, E, F, G}
        list3: {$, %, #, @, &, !} */

        ArrayList<Integer> listDigit=new ArrayList<>();
        ArrayList<Character> listLetter=new ArrayList<>();
        ArrayList<Character> listSpecial=new ArrayList<>();

        String str="ABCD123$%#@&456EFG!";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                listDigit.add(Integer.valueOf(""+str.charAt(i)));
            }
            else if(Character.isLetter(str.charAt(i))){
                listLetter.add(str.charAt(i));
            }
            else listSpecial.add(str.charAt(i));

        }
        System.out.println(listDigit);
        System.out.println(listLetter);
        System.out.println(listSpecial);


    }
}
