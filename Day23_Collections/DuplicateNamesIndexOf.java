package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNamesIndexOf {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Sumeyye", "Kenan", "Alp", "Sumeyye"));

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)) {
                System.out.println(each);
            }
        }

        System.out.println("-----------------------------------------------------");

        for (String i : names) {
            int counter = 0;
            for (String j : names) {
                if (i == j) {
                    counter++;
                }

            }
            if(counter==1) System.out.println("Unique name "+i );
            else System.out.println("Non unique "+i+" appeared "+counter+" times.");


            System.out.println("------------------------------------------------");
            boolean hasKenan=names.contains("Kenan");
            System.out.println(hasKenan);
        }
    }
}
