package GroupExercises.StreamTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyArrayElements {
    public static void main(String[] args) {
        String[] strArr = {"Apple", "Banana", "apple", "cherry", "Apple"};
        System.out.println(frequencyCheck(strArr));
    }

    public static Map<String, Long> frequencyCheck(String[] strArr) {
        Map<String, Integer> strMap = new HashMap<>();

        return Arrays.stream(strArr).map(s->s.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
