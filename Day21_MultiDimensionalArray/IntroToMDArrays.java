package Day21_MultiDimensionalArray;

import java.util.Arrays;

public class IntroToMDArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        // Single dimensional array is a container for elements
        // Two dimensional array is a container for arrays
        int[][] temp={{10,20,30},{40,50,60,70},{50,80,90,110},arr};
        System.out.println(temp.length);
        System.out.println(temp[2][1]);
       // System.out.println(temp[1]); won't print
        System.out.println(Arrays.toString(temp));
    }
}
