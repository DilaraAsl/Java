package Day22_WrapperClasses_ArrayLists;

import java.util.Arrays;

public class ReplaceAllTask {
    public static void main(String[] args) {
      int[]  arr = {10, 10, 20, 30, 40, 30, 30, 30};
        System.out.println(Arrays.toString(replaceAll(arr, 30, 300) ));

double[] arr1={10.1, 10.4, 20.0, 30.25, 40, 30.25, 30.25, 30.00};
        System.out.println(Arrays.toString(replaceAll(arr1, 30.25, 11.44) ));
        char[] arr2={'a','2','q','l','l'};
        System.out.println(Arrays.toString(replaceAll(arr2, 'l', 'z') ));

        String[] arr3={"java","mava","kava","mava","nana"};
        System.out.println(Arrays.toString(replaceAll(arr3, "mava", "lava") ));
    }

    private static int[] replaceAll(int[] arr, int value, int newValue) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                arr[i]=newValue;
            }
        }
       return arr;
    }
    private static double[] replaceAll(double[] arr, double value, double newValue) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                arr[i]=newValue;
            }
        }
        return arr;
    }
    private static char[] replaceAll(char[] arr, char value, char newValue) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                arr[i]=newValue;
            }
        }
        return arr;
    }
    private static String[] replaceAll(String[] arr, String value, String newValue) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(value)){
                arr[i]=newValue;
            }
        }
        return arr;
    }
}
