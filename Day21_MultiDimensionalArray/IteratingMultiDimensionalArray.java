package Day21_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {
        int[][] arr2D={{10,20,30},{40,50,60,70},{80,90,100,110,120}};
        for (int i = 0; i < arr2D.length ; i++) { // array
            for (int j = 0; j <arr2D[i].length ; j++) { //elements in the array
                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println("-----------------------------------");
            for (int[] eachArr : arr2D) {
               // System.out.println(Arrays.toString(eachArr));
                for(int each: eachArr){
                    System.out.print(each+" ");
                }
            }


            }
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j]);

            }

            }
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]);
            }

        }
        }
        }

