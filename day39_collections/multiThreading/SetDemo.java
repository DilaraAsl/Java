package day39_collections.multiThreading;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 200, 65, 35));

        Set<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, null, 90));// does not accept duplicates
        System.out.println(set1);
        Set<Integer> linkedSet = new LinkedHashSet<>(Arrays.asList(10, 300, 40, null, null));
        Set<Integer> linkedSet2 = new LinkedHashSet<>(Arrays.asList(10, 300, 40));
        Set<Integer> linkedSet3 = new LinkedHashSet<>(Arrays.asList(10, 300, 40));
        System.out.println(linkedSet);

        //  Set<Integer> treeSet = new TreeSet<>();
        //  treeSet.addAll(Arrays.asList(10, 65, 90, null));
        //  System.out.println(treeSet);

        String[] words = {"Java", "Java", "Python", "Python", "C", "C", "Java"};
        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        System.out.println(result);

        System.out.println(new ArrayList<>(result).get(1)); // convert to list

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 45, 1, 20, 30, 50, 50, 24, 1, 10));
        Set<Integer> n = new TreeSet<>();
        n.addAll(numbers);
        System.out.println(n);
        System.out.println(new TreeSet<>(numbers)); // treeset eliminates duplicates orders


    }
}
