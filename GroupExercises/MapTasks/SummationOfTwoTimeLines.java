package GroupExercises.MapTasks;

import java.util.HashMap;
import java.util.Map;

public class SummationOfTwoTimeLines {
    public static void main(String[] args) {
        Map<Integer, Double> seriesA = new HashMap<>();
        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);
        Map<Integer, Double> seriesB = new HashMap<>();
        seriesB.put(2, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.0);
        System.out.println(summationOfTwoTimeLines(seriesA, seriesB).toString());
    }

    private static Map<Integer, Double> summationOfTwoTimeLines(Map<Integer, Double> seriesA, Map<Integer, Double> seriesB) {

        Map<Integer, Double> sumOfSeries = new HashMap<>(seriesA);


        for (Map.Entry<Integer, Double> eachB : seriesB.entrySet()) {

            if (!sumOfSeries.containsKey(eachB.getKey())) {
                sumOfSeries.put(eachB.getKey(), eachB.getValue());
            } else sumOfSeries.put(eachB.getKey(), sumOfSeries.get(eachB.getKey()) + eachB.getValue());
        }
        return sumOfSeries;
    }

    public static Map<Integer, Double> sumTimes(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        Map<Integer, Double> result = new HashMap<>(map1);
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0D) + entry.getValue());
        }
        return result;
    }

    public static Map<Integer, Double> sumTimes3(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        Map<Integer, Double> result = new HashMap<>(map1);
        map2.forEach((k, v) -> result.put(k, result.getOrDefault(k, 0D) + v));
        return result;
    }
}
