package GroupExercises.MapTasks;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersMap {
    public static void main(String[] args) {
        String str = "dilara";
        // System.out.println(frequencyOfCharacters(str).toString());
        System.out.println(getIndexOfUniqueVowel2(str));
    }

    public static Map<String, Integer> frequencyOfCharacters(String str) {
        Map<String, Integer> frequencyOfCharMap = new LinkedHashMap<>();
        frequencyOfCharMap.put(null, null);
        String[] strList = str.split("");


        if (str.isEmpty()) return Collections.<String, Integer>emptyMap();


        for (String each : strList) {
            if (!frequencyOfCharMap.containsKey(each)) {
                frequencyOfCharMap.put(each, 1);
            } else {
                frequencyOfCharMap.put(each, frequencyOfCharMap.get(each) + 1);
            }

        }
        return frequencyOfCharMap;
    }

    static Map<Character, Integer> getFrequencyOfCharacters(String str) {
        if (str == null) return null;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    static int getIndexOfUniqueVowel2(String str) {
        char firstUnique = 0;
        int index = -1;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> eachCharacter : map.entrySet()) {

            if ((eachCharacter.getKey() == 'a' ||
                    eachCharacter.getKey() == 'e' ||
                    eachCharacter.getKey() == 'i' ||
                    eachCharacter.getKey() == 'o' ||
                    eachCharacter.getKey() == 'u') && eachCharacter.getValue() == 1) {
                firstUnique = (char) eachCharacter.getKey();
                break;
            }

        }
        for (int i = 0; i < str.length(); i++) {
            if (firstUnique == str.charAt(i)) return i;

        }
        return -1;
    }


    static int getIndexOfUniqueVowel(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {

                map.put(ch[i], i); // value is initialized with the index no
            } else map.put(ch[i], -1); // more than one reoccurrence of the vowel is value is set to -1
        }

        for (Integer value : map.values()) {
            if (value >= 0) {
                return value;
            }

        }

        return -1;
    }
}