package Day22_WrapperClasses_ArrayLists;

import java.util.ArrayList;

public class CombineStringArrayToArrayList {
    public static void main(String[] args) {
       String[]  arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> mergedStr=new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {
           mergedStr.add(arr1[i]);
        }
        for (int j = 0; j <arr2.length ; j++) {
            mergedStr.add(arr2[j]);

        }
        System.out.println(mergedStr);
    }
}
