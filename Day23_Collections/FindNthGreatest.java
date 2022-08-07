package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNthGreatest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Sumeyye", "Kenan", "Alp", "Sumeyye","Ali", "Veli","Ali"));
        ArrayList<String> nonDuplicates=new ArrayList<>();

        for (String each : names) {
            if(!nonDuplicates.contains(each)){
                nonDuplicates.add(each);
            }
        }
        names=nonDuplicates; // now nonDuplicates elligible for garbage collection
        System.out.println(names);
    }
}

