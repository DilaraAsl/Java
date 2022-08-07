package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(23,44,1,5,37,88,45));
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(23);
        list.addAll(numbers);
        System.out.println(list);
        System.out.println("----------------------------------------------------");
        ArrayList<Integer> scores=new ArrayList<>();
        scores.addAll(Arrays.asList(85,92,44));
        scores.removeAll(Arrays.asList(85,44));
        System.out.println(scores);

        Integer[] nums={1,2,3,4,5,6};
        ArrayList<Integer> l1=new ArrayList<>();
        // l1.addAll(nums); won't work addAll passes Collection Type as Argument

        l1.addAll(Arrays.asList(nums)); // Arrays as list accepts non-primitive array type and returns List which is a collection

        ArrayList<Integer> newNumbers=new ArrayList<>(Arrays.asList(nums));
        newNumbers.retainAll(Arrays.asList(1,3,5));
        System.out.println(newNumbers);

        ArrayList<String> groceryList=new ArrayList<>(Arrays.asList("eggs","eggs","bananas","ice cream","ice cream"));
        groceryList.retainAll(Arrays.asList("eggs","ice cream"));
        System.out.println(groceryList);
    }
}
