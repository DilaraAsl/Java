package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] arr1={"A", "B", "C"};
        String[] arr2={"D", "E", "F", "G"};
        ArrayList<String> mergedArray=new ArrayList<>(Arrays.asList(arr1));
        mergedArray.addAll(Arrays.asList(arr2));
        System.out.println(mergedArray);





    }
}
