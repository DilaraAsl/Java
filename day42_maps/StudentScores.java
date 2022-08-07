package day42_maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentScores {
    public static void main(String[] args) {

        Map<String, int[]> studentScores = new LinkedHashMap<>();

        int[] scores1 = {75, 88, 90, 100, 85};
        int[] scores2 = {79, 88, 95, 100, 55};
        int[] scores3 = {55, 98, 76, 68, 85};
        int[] scores4 = {95, 98, 76, 68, 75};
        int[] scores5 = {66, 78, 76, 68, 85};

        studentScores.put("Matt", scores1);
        studentScores.put("Linda", scores2);
        studentScores.put("James", scores3);
        studentScores.put("Kevin", scores4);
        studentScores.put("Nina", scores5);

        for (Map.Entry<String, int[]> eachEntry : studentScores.entrySet()) {
            System.out.println(eachEntry.getKey() + " " + Arrays.toString(eachEntry.getValue()));

        }


    }
}
