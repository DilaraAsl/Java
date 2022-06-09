package Day20_ArraysUtilityClass;

import utilities.ArrayUtility;
import utilities.StringUtility;

public class ReverseSecond {
    public static void main(String[] args) {
        String sentence="I love Java";
        String[] temp=sentence.split(" ");
        temp[1]="evol";
        //temp[1]= StringUtility.reverse(temp[1]);
        for (String each : temp) {
            System.out.print(each+" ");

        }
    }
}
