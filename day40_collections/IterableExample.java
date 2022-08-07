package day40_collections;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 22, 33, 21, 3, 5, 77, 4));


     /*   for (Integer each : list) {
            if (each < 5) {
                list.remove(each);
            }
        } */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
            System.out.println(list);
        }
        System.out.println("-----------------------------------------");
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 22, 33, 21, 3, 5, 77, 4, 3, 11, 8, 0, 3, 2));
        Iterator<Integer> it = list2.iterator();//if you want to remove the elements declare iterator explicitly
        // this is how for each loop works  implicitly
        while (it.hasNext()) {
            Integer each = it.next();
            if (each < 10) {
                it.remove();
            }

        }
        System.out.println(list2);

        System.out.println("--------------------------------------------");
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 22, 33, 21, 3, 5, 77, 4, 3, 11, 8, 0, 3, 2));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) { // no need to increment
            Integer each = i.next();
            if (each < 5) {
                i.remove();
            }
        }
        System.out.println(list3);

        System.out.println("--------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 22, 33, 21, 3, 5, 77, 4, 3, 11, 8, 0, 3, 2));
        list4.removeIf(each -> each < 10);
        System.out.println(list4);

        System.out.println("--------------------------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 22, 33, 21, 3, 5, 77, 4, 3, 11, 8, 0, 3, 2));
        list5.removeIf(p -> p < 20);
        System.out.println(list5);
    }
}
