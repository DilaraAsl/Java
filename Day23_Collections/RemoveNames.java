package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNames {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        list.removeAll(Arrays.asList("Ahmed"));
        System.out.println(list);
    }
}
