public class SecondLargestElement {

    static int second_largest_with_identical(int[] nums) {
        if (nums.length < 2)
            return -1;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (secondMax < nums[i] && nums[i] != firstMax)
                secondMax = nums[i];
        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 35, 1, 35, 8, 1 };
        int secondLargest = second_largest_with_identical(nums);
        System.out.println(secondLargest);
    }
}

// Q7. Find the Second Largest Element​
// Write a Java method that finds the second largest distinct element in an
// integer array
// without sorting.​
// Handle edge cases like arrays with all identical elements.
// Input: [12, 35, 1, 10, 34, 1]​
// Output: 34

// APPROCH

// All numbers can be same while we need to return -1 so initially assign the
// first and second max with MIN_VALUE it use to easily find the second max is
// modified or not

// Current num is greater than the first max then Assign it to First max

// Second max, compare to the current value if its greater it will less than the
// firstMax but it might be same to the first max so need to check != to
// firstmax