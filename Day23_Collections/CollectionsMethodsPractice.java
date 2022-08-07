package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethodsPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,15,34,77,2,13,99));
        Collections.sort(list);
        System.out.println(list);

        // max returns max no
        Integer maxInt=Collections.max(list);
        System.out.println("Max no: " +maxInt);

        //min
        Integer minInt=Collections.min(list);
        System.out.println("Min no: "+minInt);

        Collections.reverse(list);
        System.out.println(list);

        Collections.swap(list,1,5);
        System.out.println(list);

        Collections.swap(list,0,list.size()-1);
        System.out.println(list);
        // returns the frequency in this case integer value
        System.out.println(Collections.frequency(list,10)); //print frequency of 10 in the list

        char [] letters = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println(String.valueOf(letters,1,3));

    }
}
