package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);
        returnMax(map);
        returnMin(map);
        noOfEmployees(map);
        displayNames(map);
        increaseSalary(map);
    }

    public static void returnMax(Map<String, Integer> map) {
        Integer max = Integer.MIN_VALUE;
        String highestSalary = "";
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() > max) {
                max = eachEntry.getValue();
                highestSalary = eachEntry.getKey();
            }
        }
        System.out.println(highestSalary + " has the highest salary: " + max);
    }

    public static void returnMin(Map<String, Integer> map) {
        Integer min = Integer.MAX_VALUE;
        String highestSalary = "";
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() <= min) {
                min = eachEntry.getValue();
                highestSalary = eachEntry.getKey();
            }
        }
        System.out.println(highestSalary + " has the highest salary: " + min);
    }

    public static void noOfEmployees(Map<String, Integer> map) {
        int count = 0;
        for (Integer each : map.values()) {
            if (each < 150000 && each > 120000) {
                count++;
            }

        }
        System.out.println(count + " no of employees who are paid in between 120 &&150 range");
    }

    public static void displayNames(Map<String, Integer> map) {
        map.forEach((k, v) -> {
            if (v < 118000)
                System.out.print(k + " ");
        });
        System.out.println();
    }

    public static void increaseSalary(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() < 120000) {
                eachEntry.setValue(eachEntry.getValue() + 10000);
                System.out.println(eachEntry.getKey() + " " + eachEntry.getValue());
            }
        }

    }
}
