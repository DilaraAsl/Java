package day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random
        queue1.addAll(Arrays.asList(10, 200, 400, 300, 50));
        queue1.addAll(Arrays.asList(10, 200, 400, 300, 50));
        queue1.addAll(Arrays.asList(10, 200, 400, 300, 50));
        System.out.println(queue1);
        int num1 = queue1.poll();
        System.out.println(queue1);
        int num2 = queue1.poll();
        System.out.println(queue1);
        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.addAll(Arrays.asList(10, 200, 400, 300, 50));
        // System.out.println(queue2);

        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1);


        Queue<Integer> queue3 = new LinkedList<>(Arrays.asList(10, 200, 400, 300, 50)); // accepts null
        queue3.addAll(Arrays.asList(10, 200, 400, 300, 50));
        queue3.addAll(Arrays.asList(null, null, null));
        System.out.println(queue3);
        queue3.poll();
        queue3.poll();
        System.out.println(queue3);
        System.out.println(((LinkedList) queue3).get(0));

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 400, 600, 90));
        System.out.println(list);
        // list.poll(); not allowed
        ((LinkedList) list).poll();
        System.out.println(list);

        ((Stack) list).pop();// Stack and LinkedList has no is A relationship
        System.out.println(queue3.toArray());


    }
}
