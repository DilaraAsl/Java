package Day20_ArraysUtilityClass;

import utilities.ArrayUtility;

import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,9,8};
        int[] temp=ArrayUtility.reverse(arr);
        System.out.println(Arrays.toString(temp));
        String[] names={"java","mava","kava"};
        String[] revNames= ArrayUtility.reverse(names);
        System.out.println(Arrays.toString(revNames));
    }
}
