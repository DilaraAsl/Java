package Day22_WrapperClasses_ArrayLists;

import java.util.Arrays;

public class ReplaceTask {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        double[] arr2={1.2,4.5,6.1,7.7};
        String[] arr3={"java","mava","kava"};
        System.out.println(Arrays.toString(replace(arr,2,30)));
        System.out.println(Arrays.toString(replace(arr2,2,11.33)));
        System.out.println(Arrays.toString(replace(arr3,1,"lava")));
    }

    private static int[] replace(int[] arr, int index, int num) {
        int[] temp=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(index!=i){
                temp[i]=arr[i];
            }
            else temp[i]=num;
        }
        return temp;
    }
    private static double[] replace(double[] arr, int index, double num) {
        double[] temp=new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(index!=i){
                temp[i]=arr[i];
            }
            else temp[i]=num;
        }
        return temp;
    }

    private static String[] replace(String[] arr, int index, String num) {
        String [] temp=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(index!=i){
                temp[i]=arr[i];
            }
            else temp[i]=num;
        }
        return temp;
    }
}
