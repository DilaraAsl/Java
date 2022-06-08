package day14_forLoops_reviewMethods;
import java.util.*;
public class RepeatingLetters {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter a string");
        String str=kb.next();
        String noDuplicate="";
        for (int i = 0; i <str.length() ; i++) {
            char chr=str.charAt(i);
            if(!noDuplicate.contains(""+chr)){
                noDuplicate+=chr;
            }

        }
        System.out.println(noDuplicate);

    }
}