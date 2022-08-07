package XtraTasks.CollectionsTasks;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 5, 5, 7, 2));
        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1, 5, 3, 7, 2));
        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(7, 5, 3, 7, 2));
        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1, 5, 3, 7, 2));

        System.out.println("arrayList = " + arrayList);
        System.out.println("linkedList =" + linkedList);
        System.out.println("vector = " + vector);
        System.out.println("stack " + stack);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));

        }

        ((Stack) stack).pop(); // List<Integer> parent is the reference type we need to cast it to call Stack class method pop
    }
}
