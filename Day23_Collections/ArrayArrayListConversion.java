package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        String[] arr={"a","b"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
    }
}
