package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElement {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));

      //  list.remove(list.size()-1);
      //  list.add(0);

        list.set(list.size()-1,0);
        //list.set(0,5);
        System.out.println(list);

    }
}
