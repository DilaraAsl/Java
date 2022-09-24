package GroupExercises.StreamTasks;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class FindMaxIntArray {
    public static void main(String[] args) {
        int[] array={6,8,3,5,1,9};
        System.out.println(findMax(array));
    }
    public static int findMax(int[] array){
        return  Arrays.stream(array).max().orElseThrow(()->new RuntimeException());
    }
}
