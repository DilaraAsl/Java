package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Sumeyye", "Kenan", "Alp", "Sumeyye","Ali", "Veli","Ali"));
        ArrayList<String> nonDuplicates=new ArrayList<>();

        for (String each : names) {
            if(!nonDuplicates.contains(each)){
                nonDuplicates.add(each);
            }
        }
        names=nonDuplicates; // now nonDuplicates elligible for garbage collection
        System.out.println(names);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2=list1; // list2 and list1 share the same object, references to same address
        System.out.println(list1==list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list1==list3);// different addresses separate objects
        System.out.println(list1.equals(list3)); // checks the contents of the arrays and the indexes
        System.out.println(list1.isEmpty());
        names.clear();
        System.out.println(names.isEmpty());

    }
}
