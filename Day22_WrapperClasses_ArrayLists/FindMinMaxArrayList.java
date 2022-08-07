package Day22_WrapperClasses_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinMaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,15,34,77,2,13,99));
        int min=list.get(0);
        int max=list.get(0);
       /* for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<min){
                min=list.get(i);
            }
            if(list.get(i)>max){
                max=list.get(i);
            }

        } */

        System.out.println(min);
        System.out.println(max);
    }
}
