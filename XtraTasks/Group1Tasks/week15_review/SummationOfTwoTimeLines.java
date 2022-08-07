package XtraTasks.Group1Tasks.week15_review;

import java.util.HashMap;
import java.util.Map;

public class SummationOfTwoTimeLines {
    public static void main(String[] args) {
        Map<Integer, Double> a = new HashMap<>();
        a.put(1, 1.0);
        a.put(2, 1.5);
        a.put(3, 2.0);
        Map<Integer, Double> b = new HashMap<>();
        b.put(2, 1.0);
        b.put(3, 2.5);
        b.put(5, 1.0);
        System.out.println(summation(a, b));
    }

    public static Map<Integer, Double> summation(Map<Integer, Double> a, Map<Integer, Double> b) {
        Map<Integer, Double> result = new HashMap(a);
        for (Map.Entry<Integer, Double> entry : b.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0D) + entry.getValue()); // result getValue added to map2 getValue

        }
        return result;
    }
}
