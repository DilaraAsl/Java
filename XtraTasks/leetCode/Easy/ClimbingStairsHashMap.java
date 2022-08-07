package XtraTasks.leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairsHashMap {
    public static void main(String[] args) {

        System.out.println(climbingStairs(3));
    }

    public static Integer climbingStairs(int steps) {
        Map<Integer, Integer> stairs = new HashMap<>();
        int count = 3;
        stairs.put(0, 0);
        stairs.put(1, 1);
        stairs.put(2, 2);
        if (steps > 2) stairs.put(steps, stairs.get(steps - 1) + stairs.get(steps - 2));
        for (int i = 3; i < 45; i++) {
            stairs.put(i, (stairs.get(i - 1) + stairs.get(i - 2)));
        }
        return stairs.get(steps);

    }

}
