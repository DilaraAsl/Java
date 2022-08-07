package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(); // random order -accept null -allows one key to be null -multiple values can be null
        map1.put("Daniel", 95000);
        map1.put("Emily", 100000);
        map1.put("Bella", 85000);
        map1.put("Daniel", 95000);// key cannot be duplicated so same name will create a problem here
        map1.put("Daniel", 120000);
        map1.put("Aaron", 78000);
        map1.put(null, null);
        map1.put(null, 3500);// only one null key is allowed null value is replaced by 3500
        System.out.println("Hashmap " + map1);


        Map<String, Integer> map2 = new LinkedHashMap<>(); // keeps the insertion order -accept null key-one null key, multiple values can be null
        map2.put("Daniel", 95000);
        map2.put("Emily", 100000);
        map2.put("Bella", 85000); // key cannot be duplicated so same name will create a problem here
        map2.put("Emily", 100000);
        map2.put("Emily", 90000); // to update the value we use put method
        map2.put("Daniel", 120000);
        map2.put("Aaron", 78000);
        map2.put("Aaron", null);// null allowed
        map2.put(null, 25000); // null allowed
        System.out.println();
        System.out.println("LinkedHashMap " + map2);
        System.out.println("LinkedHashMap maintains the insertion order. ");
        System.out.println();

        Map<String, Integer> map3 = new Hashtable<>();// random order, does not accept null, synchronized
        map3.put("Daniel", 95000);
        map3.put("Emily", 100000);
        map3.put("Bella", 85000); // key cannot be duplicated so same name will create a problem here
        map3.put("Lisa", 45000);//
        //   map3.put(null, 25000);//
        System.out.println();
        System.out.println("HashTable " + map3);
        System.out.println("HashTable does not maintain the order.");
        System.out.println();

        Map<String, Integer> map4 = new TreeMap<>(); // sorted order -does not accept null key
        map4.put("Daniel", 95000);
        map4.put("Emily", 100000);
        map4.put("Bella", 85000); // key cannot be duplicated so same name will create a problem here
        map4.put("Chris", null);// value can be null
        try {
            map4.put("Diana", 25000); // key can never be null
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("TreeMap " + map4);
        System.out.println("TreeMaps order the elements in ascending order");
        System.out.println();

    }
}
