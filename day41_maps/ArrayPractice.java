package day41_maps;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        List<Integer> listItems = new ArrayList<>();
        listItems.addAll(Arrays.asList(1, 2, 3, 5, 8));
        List<Integer> listItems2 = new ArrayList<>();
        listItems2.addAll(Arrays.asList(1, 2, 3, 10, 8));

        List<Integer>[] arrayOfLists = new List[2];
        arrayOfLists[0] = listItems;
        arrayOfLists[1] = listItems2;
        System.out.println(Arrays.toString(arrayOfLists));

        arrayOfLists[0].set(1, 12); //
        System.out.println(Arrays.toString(arrayOfLists));
        System.out.println("----------------------------");

        Set<Integer>[] arrayOfSets = new Set[5];
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();

        arrayOfSets[0].addAll(Arrays.asList(1, 2, 3, 4));
        arrayOfSets[1].addAll(Arrays.asList(11, 22, 33, 44));

        System.out.println(Arrays.toString(arrayOfSets));
    }
}
