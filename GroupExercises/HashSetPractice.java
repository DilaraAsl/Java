package GroupExercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(10, 2, 312785, 40878, 54));
        System.out.println("set = " + set); // set = [2, 312785, 54, 10, 40878]
        // System.out.println(set.get(2));    // compilation error, since Set doesn't have index and get() method
        // System.out.println(new ArrayList<>(set).get(2));  // 54
    }
}
