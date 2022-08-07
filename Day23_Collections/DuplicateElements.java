package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,0,0,3,4,0,5,6,0));
        list.addAll(list);
        ArrayList<Integer> nonDuplicate=new ArrayList<>();
        for (Integer i : list) {
            int counter=0;
            for (Integer j  : list) {
                if (i==j) counter++;
            }
            if(counter>0 && !nonDuplicate.contains(i) ){
                nonDuplicate.add(i);
            }
        }
        list=nonDuplicate;
        System.out.println(list);
        Collections.sort(list);// sort ascending
        Collections.reverse(list);// reverse the array
        System.out.println(list);

    }
}
