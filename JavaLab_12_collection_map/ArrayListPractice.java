package JavaLab_12_collection_map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);


        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Brianna");
        names.add("Bella");
        names.add("James");
        names.add("James");
        System.out.println(names);

        Set<String> employees = new HashSet<>();
        employees.addAll(names);
        System.out.println(employees);

        for (String each : employees) {
            //if (each.equals("James")) {
            //    Iterator<String> n = employees.iterator();
            //    n.remove();
            // }
            System.out.println(each);

        }
        System.out.println(new ArrayList(employees).get(1));

        //employees.removeIf(p -> p.equals("James"));

        System.out.println(employees);
        employees.forEach(c -> System.out.println(c)); // represents each element
        System.out.println("--------------------------------------------------------");
        employees.forEach(c -> {
            if (!c.equals("James")) {
                System.out.println(c);
            }
        });
    }
}
