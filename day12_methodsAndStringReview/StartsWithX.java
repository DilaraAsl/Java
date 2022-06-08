package day12_methodsAndStringReview;
import java.util.Scanner;
public class StartsWithX {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a word:");
        String word=kb.next().trim();
        if(word.substring(0,1).equals("x")) {word="a"+word.substring(1);};
        System.out.println(word);
    }
}
