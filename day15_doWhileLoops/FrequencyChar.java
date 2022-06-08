package day15_doWhileLoops;
import java.util.*;
public class FrequencyChar {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a string");
        String str=kb.next();
        System.out.println("please enter a character");
        String chr=kb.next();
        int length=str.length();
        int counter=0;
        for (int i = 0; i < length; i++) {
            if(chr.charAt(0)==str.charAt(i)){
                counter++;

            }


        }
        System.out.println(counter);
    }
}
