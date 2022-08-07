package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>(); // preserve the insertion order -one object is stored in this map
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job title", "Developer");
        person1.put("salary", 100050.75);
        person1.put("Hired date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);
        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>(); //
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 32);
        person2.put("job title", "Back end Developer");
        person2.put("salary", 90000);
        person2.put("Hired date", LocalDate.of(2022, 3, 15));
        person2.put("married", true);
        System.out.println(person2.get("name"));

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Matt");
        person3.put("gender", 'M');
        person3.put("age", 32);
        person3.put("job title", "Back end Developer");
        person3.put("salary", 170000);
        person3.put("Hired date", LocalDate.of(2022, 3, 15));
        person3.put("married", false);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Leslie");
        person4.put("gender", 'F');
        person4.put("age", 38);
        person4.put("job title", "Back end Developer");
        person4.put("salary", 150000);
        person4.put("Hired date", LocalDate.of(2018, 8, 15));
        person4.put("married", false);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Haley");
        person5.put("gender", 'F');
        person5.put("age", 41);
        person5.put("job title", "Back end Developer");
        person5.put("salary", 130000);
        person5.put("Hired date", LocalDate.of(2012, 8, 15));
        person5.put("married", true);

        Map<String, Object>[] arrayOfMap = new Map[5];
        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;
        arrayOfMap[4] = person5;

        System.out.println(Arrays.toString(arrayOfMap));

        arrayOfMap[4].replace("salary", ((Integer) arrayOfMap[4].get("salary")) + 20000);
        System.out.println(arrayOfMap[4].toString());

        arrayOfMap[0].replace("name", "Hasan");
        System.out.println(arrayOfMap[0].toString());

        int count = 0;
        for (Map<String, Object> eachMap : arrayOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("salary")) {

                    //      if (((Integer)eachEntry.getValue()) < 100000) {
                    //        count++;
                    //     }
                }

            }

        }
        System.out.println(count);

    }
}
