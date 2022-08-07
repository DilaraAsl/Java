package day39_collections.multiThreading;

import java.util.Stack;

public class TestMultiThreads {
    public static void main(String[] args) {
      /*  Thread thread1 = new ThreadHelloWorld(1);
        Thread thread2 = new ThreadHelloWorld(2);
        Thread thread3 = new ThreadHelloWorld(3);
        Thread thread4 = new ThreadHelloWorld(4);
        Thread thread5 = new ThreadHelloWorld(5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


        Vector<Integer> vector = new Vector<>(); */

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
