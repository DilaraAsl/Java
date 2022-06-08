package Day19_IntroToArrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] temp=new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            temp[j]=array[i];
        }
        array=temp; // re-assigns the array to temp
        System.out.println(Arrays.toString(array));
    }
}
