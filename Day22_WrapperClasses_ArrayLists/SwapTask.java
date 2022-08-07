package Day22_WrapperClasses_ArrayLists;

import java.util.Arrays;

public class SwapTask {
    public static void main(String[] args) {
       int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(swap(arr,2,3)));
        String[] arr3={"java","mava","kava","lava","nana"};
        System.out.println(Arrays.toString(swap(arr3,0,4)));
    }

    public static int[] swap(int[] arr, int index1, int index2) {
        int[] newArr=new int[arr.length];
        int temp=0;
        for (int i =0; i <arr.length; i++) {
            if(index1==i){
                temp=arr[i]; // temp holds index1 temporarily
                newArr[i]=arr[index2];
                continue;
            }
            if(index2==i){
                newArr[i]=temp;
                continue;
            }
            newArr[i]=arr[i];

        }

        return newArr;
    }
   public static double[] swap(double[] arr, int index1, int index2) {
        double[] newArr=new double[arr.length];
        double temp=0;
        for (int i =0; i <arr.length; i++) {
            if(index1==i){
                temp=arr[i]; // temp holds index1 temporarily
                newArr[i]=arr[index2];
                continue;
            }
            if(index2==i){
                newArr[i]=temp;
                continue;
            }
            newArr[i]=arr[i];

        }

        return newArr;
    }
    public static char[] swap(char[] arr, int index1, int index2) {
        char[] newArr=new char[arr.length];
        char temp=0;
        for (int i =0; i <arr.length; i++) {
            if(index1==i){
                temp=arr[i]; // temp holds index1 temporarily
                newArr[i]=arr[index2];
                continue;
            }
            if(index2==i){
                newArr[i]=temp;
                continue;
            }
            newArr[i]=arr[i];

        }

        return newArr;
    }
    public static String[] swap(String[] arr, int index1, int index2) {
        String[] newArr=new String[arr.length];
        String temp="";
        for (int i =0; i <arr.length; i++) {
            if(index1==i){
                temp=arr[i]; // temp holds index1 temporarily
                newArr[i]=arr[index2];
                continue;
            }
            if(index2==i){
                newArr[i]=temp;
                continue;
            }
            newArr[i]=arr[i];

        }

        return newArr;
    }
}
