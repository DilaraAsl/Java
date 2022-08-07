package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf_Practice {
    /* 2. Write a program that can remove tehe elemnts that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]


    *  */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
// in a for loop when we use for loop to remove elements because ArrayList size dynamically adjusted we won't be able to remove all the elements
        list.removeIf(each-> each<4);
        System.out.println(list);
        // remove if for Strings
        ArrayList<String> names=new ArrayList<>(Arrays.asList("java","python","lava"));
        names.removeIf(each->each.startsWith("j"));
        System.out.println(names);
    }

}
