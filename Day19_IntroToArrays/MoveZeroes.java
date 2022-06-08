package Day19_IntroToArrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] array={10,0,5,0,1,0};
        int[] temp=new int[array.length];
        int j=0;
        for (int i = 0;i< array.length-1; i++) {

            if(array[i]>0) {
                temp[j]=array[i];
                j++;}


        }
        array=temp;
        System.out.println(Arrays.toString(array));
    }
}
