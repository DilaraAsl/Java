package InterviewPrep.Ch1;

import java.util.Arrays;
import java.util.Scanner;

public class URLify {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println(urlify(kb.nextLine()));
    }

    public static String urlify(String str) {


      String[] list = str.split(" ");

        for (int i = list.length; i>1; i--) {
            list[i-2] += "%20";
        }

        return Arrays.toString(list);
    }
}