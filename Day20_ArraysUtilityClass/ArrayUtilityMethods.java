package Day20_ArraysUtilityClass;

import utilities.ArrayUtility;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        int[] score = {70, 100, 80, 90, 65};
        int[] score2 = {70, 100, 80, 90, 65};
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.equals(score, score2));
        String[] str1 = {"A", "B", "C"};
        String[] str2 = {"a", "b", "c"};
        String[] str3 = {"B", "A", "C"};
        System.out.println(Arrays.equals(str1, str2));
        String[] str = ArrayUtility.merge(str1, str2);
        System.out.println(Arrays.toString(str));
        int[] mergedArr = ArrayUtility.merge(score, score2);
        Arrays.sort(mergedArr); // does not return a value, void method -sorts in order - cannot be used in a print statement
        System.out.println(Arrays.toString(mergedArr));
        Arrays.sort(str3);
        System.out.println(Arrays.equals(str1, str3));

        int[] score3 = {80, 100, 70, 90, 65};
        int[] newArray = Arrays.copyOf(score3, 3); // copies the first three elements to the new array
        System.out.println(Arrays.toString(newArray));

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10};
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        for (int i = 0; i < n2.length; i++) {
            n3[n1.length + i] = n2[i];

        }
        System.out.println(Arrays.toString(n3));

        int[] score4=Arrays.copyOfRange(score3,2,5);
        System.out.println(Arrays.toString(score4));
    }
}
