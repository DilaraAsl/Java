package Day22_WrapperClasses_ArrayLists;

public class FindMax {
    public static void main(String[] args) {
      /*  Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
        array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

        output:
        Minimum number is: -200
        Maximum number is: 1000 */


        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {


            for (int j = 0; i < array.length; i++) {


                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }

            }
            System.out.println(max);
            System.out.println(min);


            for (int[] each1D : array) {
                for (int eachElement : each1D) {
                    if (max < eachElement) {
                        max = eachElement;
                    }
                }

            }
            System.out.println(max);

        }
    }
}