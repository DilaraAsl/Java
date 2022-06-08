package Day19_IntroToArrays;

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] array1=new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=i+1;

        }
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]+" ");

        }
        System.out.println("array1 = " + Arrays.toString(array1));

        //**********************************************************************
        for (int i = 0, j=10; i < array1.length; i++,j+=10) {
            array1[i]=j;
        }
        System.out.println("array1 = " + Arrays.toString(array1));

        int[] arr2=new int[100];

        for (int i = arr2.length - 1,j=0; i >= 0; i--,j++) {
            arr2[j]=i;

        }
        int[] arr3=new int[100];

        for (int i = arr3.length - 1; i >= 0; i--) {
            arr3[i]=100-i;
        }
        System.out.println("arr3 = " + Arrays.toString(arr3));
        for (int i = 0,j=100; i < arr3.length; i++,j--) {


        }
    }

}
