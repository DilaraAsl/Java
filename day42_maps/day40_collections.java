package day42_maps;

import java.util.*;

public class day40_collections {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(100, 200, 300));
        System.out.println(((ArrayList) collection).get(2));
        //System.out.println(((Stack)collection).pop()); // Class cast exception because no relationship between ArrrayList and stack
        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 400, 100, 400, 300));

        //   System.out.println(((ArrayList)collection2).get(0)); // Hashset cannot be referenced to ArrayList Class cast exception
        System.out.println(new ArrayList(collection2).get(0)); // collection2 is a collection type which ArrayList constructor accepts
        List<Integer> l = new ArrayList<>(collection2); // if you are going to use it multiple times need to assign it to a reference type

    }
}
