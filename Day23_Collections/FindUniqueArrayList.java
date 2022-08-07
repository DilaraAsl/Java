package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUniqueArrayList {
    public static void main(String[] args) {
        /* Write a program that can return the first unique elements from an array list
        Ex:
        ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6} */

        ArrayList<Integer>  numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));
        ArrayList<Integer>  uniqueNums=new ArrayList<>();

        /*for (int i = 0; i < numbers.size(); i++) {
            int counter=0;
            for (int j = 0; j < numbers.size(); j++) {
                if(numbers.get(i)==numbers.get(j)){
                    counter++;
                }

            }
            if(counter==1){
                uniqueNums.add(numbers.get(i));
            }

        } */

        for (Integer i : numbers) {
            int counter=0;
            for (Integer j : numbers) {
                if(i==j){
                    counter++;
                }

            }
            if(counter==1){
                uniqueNums.add(i);
            }

        }
        System.out.println(uniqueNums);
    }
}
