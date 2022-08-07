package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5_MaxAndMind {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

       list.removeAll(Arrays.asList(Collections.min(list)));
        System.out.println(list);
        System.out.println("Minimum no:"+Collections.min(list));
        list.removeAll(Arrays.asList(Collections.max(list)));
        System.out.println("Maximum no: "+Collections.max(list));


    }
}
