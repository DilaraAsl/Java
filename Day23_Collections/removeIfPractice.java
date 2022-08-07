package Day23_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,15,34,77,2,13,99));
        list.removeIf(each-> each<15);
        System.out.println(list);

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("java","mava","kava","lava","girl","cat"));
        names.removeIf(each ->each.equals("lava"));
        names.removeIf(each ->each.startsWith("j"));
        System.out.println(names);
    }
}
