package Day20_ArraysUtilityClass;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

// : separates the data structure and the variable
        for (int each : numbers) {
            System.out.print(each + " ");
        }
            String input="1etsy#2wooden#3spoon";
            String[] array=input.split("#");
            System.out.println(Arrays.toString(array));
            String add="1"+"aaa";
String number="1";
int no=Integer.valueOf(number);
        System.out.println(no);

            array[0]=add;
        System.out.println(Arrays.toString(array));

    }
}
