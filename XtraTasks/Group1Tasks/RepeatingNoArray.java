package XtraTasks.Group1Tasks;

import java.util.HashMap;
import java.util.Map;

public class RepeatingNoArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 2, 2, 1, 1, 1};
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                map.put(nums[i], ++count);
                continue;
            }
            if ((i + 1 < nums.length && nums[i] == nums[i + 1])) {
                count++;
                continue;

            } else if (nums[i] == nums[i - 1]) {
                count++;
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], count);
                count = 0;
            } else if (count > map.get(nums[i])) {

                map.put(nums[i], count);
                count = 0;
            }


        }
        int max = 0;
        int mostFrequentNo = 0;
        for (Map.Entry<Integer, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
            if (eachEntry.getValue() > max) {
                max = eachEntry.getValue();
                mostFrequentNo = eachEntry.getKey();


            }
        }
        System.out.println("Most frequent no in the array :" + mostFrequentNo + " max occurrence " + max);
    }

}

