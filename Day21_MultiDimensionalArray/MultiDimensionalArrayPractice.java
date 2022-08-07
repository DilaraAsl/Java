package Day21_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1={"cat", "dog","horse","lamb"};
        String[] group2={"seagull","crow","pelican"};//3
        String[] group3={"banana","kiwi","apple","strawberry","peach"};//5
        String[] group4={"parsley","mint"};//2

        String[][] group={group1,group2,group3,group4};
     /*   for (String[] groupEach : group) { // loops string array group1 group2 etc...
            for (String each : groupEach) { // loops elements in each string array
                System.out.print(each+" "); }*/


            for (int i = group.length - 1; i >= 0; i--) {
               // System.out.println(Arrays.toString(group[i]));
                System.out.println();
                for (int j = group[i].length - 1; j >= 0; j--) {
                    System.out.print(group[i][j]+" ");

                }
            }

        }
    }

