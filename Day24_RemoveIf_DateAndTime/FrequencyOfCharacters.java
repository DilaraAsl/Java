package Day24_RemoveIf_DateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="aaabbdddk";
        String result="";
        String[] temp=str.split("");
        for (String each : str.split("")) {
          if  (Collections.frequency(Arrays.asList(str.split("")),each)==1)
              System.out.println("unique character in this string "+each);

            int frequency=Collections.frequency(Arrays.asList(str.split("")),each);

            // gives us the frequency of each element in the String array
            if(!result.contains(each)){
                result+=each+frequency;

            }
        }
        System.out.println(result);
    }
}
