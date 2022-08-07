package XtraTasks.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {6, 3, 2, 4, 1, 9, 11, 0, 31};
        int temp = 0;
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) { // swap
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;  // if swap happens we need to continue checking the rest of the array
                }


            }

        }
        System.out.println(Arrays.toString(list));
    }
}
