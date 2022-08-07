package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAverageArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,15,34,77,2,13,99));
        System.out.println(list);
        int sum=0;

        /* operations cannot be done in a for each loop
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }*/
        for (Integer integer : list) {
            sum+=integer;
        }



        System.out.println(sum);
        double average=sum/(list.size()-1*1.0);
        System.out.println(average);
    }
}
