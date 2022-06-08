package Day20_ArraysUtilityClass;

import java.util.Arrays;

import static utilities.ArrayUtility.merge;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7};
       /* int[] temp=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i]=arr1[i];
        }
        for (int k = 0,j=arr1.length; k < arr2.length; k++,j++) {

            temp[j]=arr2[k];

        }*/

       int[] temp= merge(arr1,arr2);
        System.out.println(Arrays.toString(temp));
        String[] names={"java","mava","kava"};
        String[] lastN={"girl","man","cat"};
        String[] str=merge(names,lastN);
        System.out.println(Arrays.toString(str));
    }
}
