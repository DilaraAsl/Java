package XtraTasks.leetCode;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        //  System.out.println(removeDuplicates(nums));
        //   System.out.println(removeElement(nums, 3));
        System.out.println(searchInsert(nums, 2));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
// if the elements are equal
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }

        return count;
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        System.out.println(Arrays.toString(nums));
        return count;

    }


   /* public static int removeDuplicates(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int each : nums) {
            numsSet.add(each);
        }


        return numsSet.size();


    } */

    public static int searchInsert(int[] nums, int target) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            } else {
                if (i < nums.length - 1 && (target > nums[i] && target < nums[i + 1]))
                    position = i + 1;
                else if (i == nums.length - 1 && (target > nums[i])) position = i + 1;

            }

        }
        return position;
    }
}