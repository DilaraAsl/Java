package GroupExercises.CollectionTasks;

import java.util.HashMap;
import java.util.Map;

public class ReadingABook {
    public static void main(String[] args) {
        String str = "Dog dog dog";
        System.out.println(count(str));
    }

    public static int count(String str) {
        if (str.isBlank() || str.isEmpty()) return 0;
        str = str.toLowerCase();

        String[] strList = str.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String eachWord : strList) {
            eachWord = eachWord.replaceAll("[^a-zA-Z]", ""); // [^a-zA-Z0-9] regex for removing special characters

            if (!wordMap.containsKey(eachWord))  // if eachWord is not in the map put it in the map
                wordMap.put(eachWord, eachWord.length()); // value set to eachWord length
            else {
                wordMap.put(eachWord, wordMap.get(eachWord) + 1); // if map contains eachWord key then increase the value by one
            }


        }
        int sumValues = 0;

        for (Integer value : wordMap.values()) {
            sumValues += value; // sum the values in the map, which will return the total no of seconds spent on reading the sentence

        }
        return sumValues;
    }
}
