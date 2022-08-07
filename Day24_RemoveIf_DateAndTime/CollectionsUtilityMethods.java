package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C++", "C") );
        Collections.replaceAll(names,"Java","Python");

        System.out.println(names);

        System.out.println( "Frequency of Python is "+Collections.frequency(names,"Python"));
        System.out.println("---------------------------------------------------------------");

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,333,4,2,333,4));
        for (Integer each : numbers) {
           if( Collections.frequency(numbers,each)==1){
               System.out.println("unique number in the array "+each);
           }
        }
    }
}
