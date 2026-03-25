import java.util.*;

public class MajorityElement {

    public static int majority_element_by_map(int[] arr) { // Space O(n) | Time O(n)
        HashMap<Integer, Integer> occ = new HashMap<>();

        for (int val : arr) {
            occ.put(val, occ.getOrDefault(val, 0) + 1);
        }

        int majority_ele = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : occ.entrySet()) {
            if (majority_ele == Integer.MIN_VALUE)
                majority_ele = entry.getKey();
            else if (occ.get(majority_ele) < entry.getValue()) {
                majority_ele = entry.getKey();
            }
        }

        return majority_ele;
    }

    public static int majority_element_by_sort(int[] arr) { // Space O(1) | Time O(n log(n))
        Arrays.sort(arr);

        int result = arr[0];
        int count = 1;
        int maxcount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i])
                count++;
            else {
                count = 1;
            }

            if (count > maxcount) {
                result = arr[i];
                maxcount = count;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3 };
        // System.out.println(majority_element_by_map(arr));
        System.out.println(majority_element_by_sort(arr));

    }
}

// Q10. Majority Element​
// Write a Java method that finds the majority element in an array — the element
// that
// appears more than ⌊n/2⌋ times.​
// You may assume the majority element always exists.
// Input: [3, 2, 3] → 3​
// Input: [2, 2, 1, 1, 2] → 2