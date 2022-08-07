package day40_collections;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "john", "mustafa"));
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("-------------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "john", "mustafa", "mell", "nina"));
        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);

        System.out.println("--------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 5, 6, 79, 11, 44, 66, 22, 77, 111, 33, 22));
        // last element returns the max number in the set by adding the list to a tree set
        Set<Integer> set = new TreeSet<>(numbers);
        System.out.println(((TreeSet) set).last());
        System.out.println(set);
        System.out.println(new ArrayList<>(set).get(numbers.size() - 6));

        Collections.reverse(numbers);
        System.out.println(numbers);
        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }
        int max = Collections.max(numbers);
        System.out.println(max);


    }
}
