package XtraTasks.leetCode.Easy;

import java.util.Arrays;

public class LongestPrefix2 {

    public static void main(String[] args) {
        String[] list = {"flow", "flock", "flocked"};
        System.out.println(findLongestPrefix(list));

    }

    public static String findLongestPrefix(String[] list) {
        String prefix = "";
        Arrays.sort(list);
        for (int i = 0; i < list[0].length(); i++) {
            if (i + 1 < list[0].length() && (list[0].charAt(i) == list[list.length - 1].charAt(i))) {
                prefix += list[0].charAt(i);

            } else break;

        }
        return prefix;

    }
}
