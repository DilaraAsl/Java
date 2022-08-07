package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1_UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        int frequency=0;
        list.removeIf(each->Collections.frequency(list,each)!=1);
        System.out.println(list);

    }
}
