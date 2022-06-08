package Day19_IntroToArrays;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        int[] arr2=arr1;
        arr2[1]=33;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        String[] student={"Umran","Mehmet"};

        student=new String[]{"james","daniel"}; // a new object created, former object is eligible for garbage collection
        System.out.println(Arrays.toString(student));
    }


}
