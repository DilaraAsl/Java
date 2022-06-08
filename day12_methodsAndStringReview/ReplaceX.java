package day12_methodsAndStringReview;
import java.util.Scanner;
public class ReplaceX {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a word:");
        String word=kb.next().trim();
        word=word.toLowerCase();
        word=word.replace('x','a');
        System.out.println(word);

    }
}
