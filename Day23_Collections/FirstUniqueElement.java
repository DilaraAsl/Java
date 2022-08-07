package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.frequency;

public class FirstUniqueElement { // find first unique element in an arraylist
    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));

        for (Integer i : numbers) {
            int counter=0;
            for (Integer j : numbers) {
                if (i==j){
                    counter++;
                }

            }
            if (counter==1){
                System.out.println("First Unique Element :"+ i);
                break; // exit the loop when we find the first unique element
            }

        }
        System.out.println("frequency of 1  :"+Collections.frequency(numbers,1));


    }
}
