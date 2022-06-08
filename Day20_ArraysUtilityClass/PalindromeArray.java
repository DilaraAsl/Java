package Day20_ArraysUtilityClass;

import utilities.StringUtility;

public class PalindromeArray {
    public static void main(String[] args) {
        int counter=0;
        String[] str={"anna","level","java"};
        for (String each : str) {
            if(each.equals(StringUtility.reverse(each))) counter++;
        }
        System.out.println(counter);
    }
}
