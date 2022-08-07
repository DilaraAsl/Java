package JavaLab_12_collection_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new LinkedHashMap<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022); // object cannot reference to primitives but they are autoboxed int autoboxed to Integer
        car2.put("price", 50000);
        car2.put("electric", false); //object cannot reference to primitives but they are autoboxed boolean autoboxed to Boolean

        Map<String, Object> car3 = new LinkedHashMap<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<Integer, Map<String, Object>> myCars = new LinkedHashMap<>();
        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);

        for (Map<String, Object> value : myCars.values()) {

            System.out.println(value.get("brand") + " brand");
            System.out.println(value.get("model") + " model");
            System.out.println(value.get("price") + " price");

        }
        myCars.get(2).replace("year", 2010);

        for (Map.Entry<Integer, Map<String, Object>> eachEntry : myCars.entrySet()) {
            for (Map.Entry<String, Object> eachCarEntry : eachEntry.getValue().entrySet()) {
                if (eachCarEntry.getKey().equals("price")) {
                    eachCarEntry.setValue(((Integer) eachCarEntry.getValue()) + ((Integer) eachCarEntry.getValue()) * 0.1);
                }
            }
        }
        System.out.println(myCars);
        System.out.println("--------------------------------------------------------------");

        for (Map<String, Object> value : myCars.values()) {
            if (value.get("electric").equals(true)) {
                System.out.println(value);
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
        int max = 0;
        String maxValuedCar = "";
        for (Map.Entry<Integer, Map<String, Object>> eachEntry : myCars.entrySet()) {
            for (Map.Entry<String, Object> carEntry : eachEntry.getValue().entrySet()) {
                if (carEntry.getKey().equals("price")) {
                    System.out.println(carEntry.getValue());

                }
            }

        }
        System.out.println(max);

    }

}








