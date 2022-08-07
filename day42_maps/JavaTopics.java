package day42_maps;

import java.util.*;

public class JavaTopics {
    public static void main(String[] args) {
        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        List<Map<String, Double>> javaUnitList = new ArrayList<>(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));
        displayTopicsHours(javaUnitList);
        displaySevenHrsOrMore(javaUnitList);
        displayLessThanThreeHrs(javaUnitList);
        displayMaxHrs(javaUnitList);
        displayMinHrs(javaUnitList);
    }

    private static void displayMinHrs(List<Map<String, Double>> javaUnitList) {
        double min = displayMaxHrs(javaUnitList);
        String topicMinHrs = "";
        for (Map<String, Double> eachUnit : javaUnitList) {
            for (Map.Entry<String, Double> eachTopic : eachUnit.entrySet()) {
                if (eachTopic.getValue() < min) {
                    min = eachTopic.getValue();
                    topicMinHrs = eachTopic.getKey();
                }

            }

        }
        System.out.println("Minimum hrs spent on " + topicMinHrs + " in total: " + min);


    }

    private static double displayMaxHrs(List<Map<String, Double>> javaUnitList) {
        double max = 0;
        String topicMaxHrs = "";
        for (Map<String, Double> eachUnit : javaUnitList) {
            for (Map.Entry<String, Double> eachTopic : eachUnit.entrySet()) {
                if (eachTopic.getValue() > max) {
                    max = eachTopic.getValue();
                    topicMaxHrs = eachTopic.getKey();
                }
            }

        }
        System.out.println("Maximum hrs spent on " + topicMaxHrs + " in total :" + max);
        return max;
    }

    private static void displayLessThanThreeHrs(List<Map<String, Double>> javaUnitList) {
        System.out.println("Topics which we spent less than 3 hours are : ");

        for (Map<String, Double> eachUnit : javaUnitList) {
            for (Map.Entry<String, Double> eachTopic : eachUnit.entrySet()) {
                if (eachTopic.getValue() < 3) {
                    System.out.println(eachTopic.getKey());
                }
            }

        }
    }

    public static void displayTopicsHours(List<Map<String, Double>> javaUnitList) {
        for (Map<String, Double> eachUnit : javaUnitList) {
            System.out.println(eachUnit);
        }

    }

    public static void displaySevenHrsOrMore(List<Map<String, Double>> javaUnitList) {
        System.out.println("Topics that we spent more than 7 hrs are: ");
        for (Map<String, Double> eachUnit : javaUnitList) {
            for (Map.Entry<String, Double> eachEntry : eachUnit.entrySet()) {
                if (eachEntry.getValue() > 7) {
                    System.out.println(eachEntry.getKey());
                }
            }
        }
    }
}
