package day39_collections.multiThreading;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // array based class==>get() is faster

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>();// Node based class (doubly linked list)
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("-----------------------------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);

        vector.get(0);

        System.out.println("------------------------------------------");
        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println(stack);

        int lastElement = stack.pop();
        System.out.println(stack);
        int secondLastElement = stack.pop();
        System.out.println(secondLastElement);

        System.out.println("-----------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "Python", "Python", "C#"};
        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result);
        //  System.out.println(result.get(1)); get method is not working, not ordered
        for (String each : words) {
            System.out.println(each);

        }
        System.out.println(new ArrayList<>(result).get(1)); // new arraylist object stores the result


    }
}
