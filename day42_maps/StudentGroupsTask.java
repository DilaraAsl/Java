package day42_maps;

import java.util.*;

public class StudentGroupsTask {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new LinkedHashMap<>();

        List<String> group1 = new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison", "Kerem", "Farangis"));

        List<String> group2 = new ArrayList<>(Arrays.asList("Margie", "Vesele", "Iryn", "Nilufar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamat"));

        List<String> group9 = new ArrayList<>(Arrays.asList("Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"));

        List<String> group24 = new ArrayList<>(Arrays.asList("Maria", "Kristina", "Amin", "George", "Layan", "Amin", "Yulia", "George", "Ayanle", "Maxim", "Nermin", "Doughlas"));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"));

        map.put(1, group1);
        map.put(2, group2);
        map.put(9, group9);
        map.put(24, group24);
        map.put(5, group5);

        for (List<String> value : map.values()) {
            System.out.println(value);

        }


    }
}
