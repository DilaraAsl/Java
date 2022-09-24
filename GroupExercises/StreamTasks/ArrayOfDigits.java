package GroupExercises.StreamTasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOfDigits {
    public static void main(String[] args) {
        int n=8887;
        System.out.println(Arrays.toString(intToArray(n)));

    }
    public static int[] intToArray(int n){
        String str= Integer.toString(n);
 return (IntStream.of(str.chars().map(k->k-48).toArray())).toArray();
    }


}
