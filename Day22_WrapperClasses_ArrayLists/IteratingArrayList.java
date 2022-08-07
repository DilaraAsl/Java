package Day22_WrapperClasses_ArrayLists;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
     numbers.add(100);
     numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(2,250);

        for (int i = 0; i <numbers.size() ; i++) {
           int each=numbers.get(i);// assign it to a variable for good practice
            System.out.print(each+" ");

        }
        System.out.println();
        System.out.println("*********************************************");
        for (int i =numbers.size()-1; i>=0 ; i--) {
            int revEach=numbers.get(i);// assign it to a variable for good practice
            System.out.print(revEach+" ");
        }
        System.out.println();
        System.out.println("*********************************************");
        for (Integer each:numbers) { // wrapper class -Integer should be assigned for good practice -we are not unboxing
            System.out.print(each+" ");
        }

    }
}
