import java.util.HashMap;

public class TwoSum {
    static int[] get_index_for_two_sum(int[] nums, int target) {
        HashMap<Integer, Integer> complementryMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (complementryMap.containsKey(need))
                return new int[] { complementryMap.get(need), i };

            complementryMap.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    static int[] get_index_for_two_sum_by_iterative(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1 + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 10, 7, 15 };
        int target = 9;
        // int[] result = get_index_for_two_sum_by_iterative(nums, target);
        int[] result = get_index_for_two_sum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

// Q6. Two Sum​
// Given an array of integers and a target sum, write a Java method that finds
// and returns the indices of the two numbers that add up to the target.​
// Assume exactly one solution exists.
// Input: nums = [2, 7, 11, 15], target = 9​
// Output: [0, 1] (because nums[0] + nums[1] = 9)
