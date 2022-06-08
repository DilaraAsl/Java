package Day19_IntroToArrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] students={"joan","alex","monty"};
        System.out.println(Arrays.toString(students));
        for (int i =students.length-1 ; i>=0 ; i--) {
            System.out.println(students[i]);
            System.out.println("-------------------------------------------");
            // short cut intellij studentsfori
            for (int i1 = 0; i1 < students.length; i1++) {

            }

            // short cut intellij studentsforr (reverse for loop)
            for (int i1 = students.length - 1; i1 >= 0; i1--) {

            }

        }
    }
}
