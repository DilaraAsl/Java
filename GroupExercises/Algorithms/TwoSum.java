package GroupExercises.Algorithms;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {16, 3, 11, 5, 15};
        int target = 8;
        System.out.println(Arrays.toString(findTwoSum(target, nums)));
    }

    public static int[] findTwoSum(int target, int[] nums) {

        int[] copyNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int[] result = new int[2];
        int left = 0;
        int right = copyNums.length - 1;

        while (left < right) {

            if (nums[left] + nums[right] > target) {
                right--;
                continue;
            } else if (nums[left] + nums[right] < target) {
                left++;
                continue;
            } else {
                result[0] = nums[left];
                result[1] = nums[right];
                break;
            }


        }
        System.out.println(Arrays.toString(result));
        return findTwoSumIndexes(result[0], result[1], copyNums);
    }

    public static int[] findTwoSumIndexes(int x, int y, int[] arr) {
        int[] indexArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                indexArr[0] = i;
                break;
            }

        }
        for (int j = arr.length - 1; j > 0; j--) {
            if (y == arr[j]) {
                indexArr[1] = j;
                break;
            }

        }
        return indexArr;

    }
}
