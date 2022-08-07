package Day22_WrapperClasses_ArrayLists;

import utilities.ArrayUtility;

import java.util.Arrays;

public class ArrayMethodCont {
    public static void main(String[] args) {
        int[] numbers = {100, 20, 300,20,40,40};
        //System.out.println(ArrayUtility.contains(numbers,20));
       // System.out.println(ArrayUtility.contains(numbers,25));
        String[] names={"Dilara","Erdem","Mert","Alp"};
       // System.out.println(ArrayUtility.contains(names,"Dilara"));
        // remove numbers reassigned to a shorter array
       // numbers= ArrayUtility.remove(numbers,0);
       // System.out.println(Arrays.toString(numbers));

        // remove duplicates form array
        numbers=ArrayUtility.removeDuplicates(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
