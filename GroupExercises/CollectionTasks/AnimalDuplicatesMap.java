package GroupExercises.CollectionTasks;

import java.util.*;

public class AnimalDuplicatesMap {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(Arrays.asList("goat", "dog", "dog"));

        System.out.println(bringToTheArc(animals));
    }

    public static Map<String, Integer> bringToTheArc(List<String> animals) {
        Map<String, Integer> animalDoubles = new HashMap<>();
        if (animals.isEmpty()) return Collections.emptyMap();
        String temp = "";
        for (String eachAnimal : animals) {
            if (!temp.contains(eachAnimal)) {
                temp += eachAnimal; //temp holds the first appearance of an animal
            } else {
                animalDoubles.put(eachAnimal, 2); // if there is more than one appearance of an animal it is placed in a HashMap
            }
        }
        return animalDoubles;


    }

    static Map<String, Integer> getPairs(List<String> animals) {
        Map<String, Integer> pairs = new HashMap<>();
        for (String animal : animals) {
            int num = pairs.getOrDefault(animal, 0);
            if (num < 2) {
                pairs.put(animal, ++num);
            }
        }
        pairs.entrySet().removeIf(e -> e.getValue() == 1);
        return pairs;
    }
}
