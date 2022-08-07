package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_RemoveAllChar {
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        list.removeIf(each->Character.isLetter(each.charValue()));
        System.out.println(list);
    }
}
