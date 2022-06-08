package Day20_ArraysUtilityClass;

import java.util.Arrays;

public class OddNumber {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2!=0) arr1[i]*=2;
        }

        /*for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2==0) continue;
            arr1[i]*=2;
        }
        *
        *  */
        System.out.println(Arrays.toString(arr1));
    }
}
