package Day22_WrapperClasses_ArrayLists;

import java.util.Arrays;

public class InsertTask {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr, 2, 100)));
        char[] arr2={'a','2','q','l','l'};
        System.out.println(Arrays.toString(insert(arr2, 2, 'z')));
        String[] arr3={"java","mava","kava","mava","nana"};
        System.out.println(Arrays.toString(insert(arr3, 2, "Lava")));
    }

    private static int[] insert(int[] arr, int index, int newValue) {
        int[] temp = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == index) {
                temp[i] = newValue;
            } else {
                temp[i] = arr[j];
                j++;
            }

        }
        return temp;
    }
    private static double[] insert(double[] arr, int index, double newValue) {
        double [] temp = new double[arr.length + 1];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == index) {
                temp[i] = newValue;
            } else {
                temp[i] = arr[j];
                j++;
            }

        }
        return temp;
    }
    private static char[] insert(char[] arr, int index, char newValue) {
        char[] temp = new char[arr.length + 1];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == index) {
                temp[i] = newValue;
            } else {
                temp[i] = arr[j];
                j++;
            }

        }
        return temp;
    }
    private static String[] insert(String[] arr, int index, String newValue) {
        String [] temp = new String[arr.length + 1];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == index) {
                temp[i] = newValue;
            } else {
                temp[i] = arr[j];
                j++;
            }

        }
        return temp;
    }
}
