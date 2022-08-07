package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");
        int femaleCounter = 0;
        // find the no of females
        for (String each : employeeMap.keySet()) {
            String gender = employeeMap.get(each);
            if (gender.equals("F")) {
                femaleCounter++;
            }

        }
        int maleEmployees = employeeMap.size() - femaleCounter;
        System.out.println("females:" + femaleCounter);
        System.out.println("males: " + maleEmployees);


        System.out.println("------------------------------------------------------------");
        int countFemales = 0;
        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")) {
                countFemales++;
            }

        }

        // display the names of the female employees
        for (String name : employeeMap.keySet()) {
            String gender2 = employeeMap.get(name);
            if (gender2.equals("F")) {
                System.out.println(name);
            }

        }

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                System.out.println(eachEntry.getKey());
            }
        }

        // update the values best iteration is by entrySet
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                eachEntry.setValue("M");
            } else {
                eachEntry.setValue("F");
            }
        }

    }
}
