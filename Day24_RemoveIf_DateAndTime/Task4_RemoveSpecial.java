package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4_RemoveSpecial {
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        list.removeIf(each->!Character.isDigit(each.charValue()));
        System.out.println(list);
    }
}
