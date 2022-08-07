package InterviewPrep.Ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CharArrayAddToArrayList {
    public static void main(String[] args) {
        String str="java123";
        char[] chrArr=str.toCharArray();
        Arrays.sort(chrArr);
        System.out.println(Arrays.toString(chrArr));
        ArrayList<String> newList=new ArrayList<>(Arrays.asList(Arrays.toString(chrArr)));// add char to String arrayList
        System.out.println(newList);



    }
}
