package GroupExercises.StreamTasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String str="success";
        System.out.println(firstUniqueChar(str));
        }



    public static String firstUniqueChar(String str){
        str=str.toLowerCase();
        String[] strArray=str.split("");
        Map<String,Integer> strMap=new LinkedHashMap<>();
        for (String each : strArray) {
            strMap.put(each, strMap.getOrDefault(each,0)+1);

        }
        return strMap.keySet().stream().filter(s->strMap.get(s.toLowerCase())==1).findFirst().get();



    }
}
