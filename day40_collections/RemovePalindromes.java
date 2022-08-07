package day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

      /*  Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();

            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

            }
            if (each.equalsIgnoreCase(reverse)) {
                //   names.remove(each); // we can't use the remove method of the Collection -order index nos change
                it.remove(); // we can only use iterator's remove method to remove an element
            }
        } */
        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );


        names2.removeIf(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));
        System.out.println(names2);
    }
}
