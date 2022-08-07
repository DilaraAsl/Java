package day42_maps;

import java.util.*;

public class MapPractice3 {
    public static void main(String[] args) {
        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "gold");
        car1.put("price", 45000.50);

        Map<String, Object> car2 = new LinkedHashMap<>();
        car2.put("brand", "BMW");
        car2.put("model", "X5");
        car2.put("year", 2021);
        car2.put("color", "gold");
        car2.put("price", 45000.50);

        Map<String, Object> car3 = new LinkedHashMap<>();
        car3.put("brand", "BMW");
        car3.put("model", "X5");
        car3.put("year", 2021);
        car3.put("color", "gold");
        car3.put("price", 45000.50);

        List<Map<String, Object>> cars = new ArrayList<>(Arrays.asList(car1, car2, car3));
    }
}
