package day42_maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CarTask {
    public static void main(String[] args) {
        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<Integer, Map<String, Object>> myCars = new HashMap<>();
        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);

        displayBrandModelPrice(myCars);
        displayElectricCar(myCars);
        mostExpensiveCar(myCars);
    }

    public static void displayBrandModelPrice(Map<Integer, Map<String, Object>> myCars) {
        for (Map<String, Object> eachObj : myCars.values()) {
            for (Map.Entry<String, Object> eachEntry : eachObj.entrySet()) {
                if (eachEntry.getKey().equals("brand")) {
                    System.out.println(eachEntry.getKey() + " " + eachEntry.getValue());
                }
                if (eachEntry.getKey().equals("price")) {
                    System.out.println(eachEntry.getKey() + " " + eachEntry.getValue());
                }
                if (eachEntry.getKey().equals("model")) {
                    System.out.println(eachEntry.getKey() + " " + eachEntry.getValue());
                }


            }

        }
    }

    public static void displayElectricCar(Map<Integer, Map<String, Object>> myCars) {
        for (Map<String, Object> carObj : myCars.values()) {

            if (carObj.get("electric").equals(true)) {
                System.out.println(carObj.get("brand") + " is electric");
            }
        }
    }

    public static void mostExpensiveCar(Map<Integer, Map<String, Object>> myCars) {
        Integer max = Integer.MIN_VALUE;
        String mostExpensive = "";
        for (Map<String, Object> carObj : myCars.values()) {

            if (((Integer) carObj.get("price")) > max) {
                max = ((Integer) carObj.get("price"));
                mostExpensive = (String) carObj.get("brand");
            }

        }
        System.out.println(mostExpensive + " is the most expensive car :" + max);
    }


}



