package day16_nestedLoops;

import java.util.Locale;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "java JAva javA jAva";
        String word="java";
        str=str.toLowerCase();
        word=word.toLowerCase();
        int counter = 0;

        while (str.contains("java")) {



            str=str.replaceFirst("java","");
            counter++;
        }
        System.out.println(counter);
    }
}
