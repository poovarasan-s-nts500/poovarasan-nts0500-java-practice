public class MissingNumber {

    public static int get_missing_number(int[] input) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int val : input) {
            if (max < val)
                max = val;
            sum += val;
        }

        if (max != input.length)
            return input.length;

        return ((max * (max + 1)) / 2) - sum;
    }

    public static void main(String[] args) {
        int[] input = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        System.out.println(get_missing_number(input));
    }
}

// Q24. Find the Missing Number​
// Given an array of n distinct numbers taken from the range [0, n], find the
// one number
// that is missing.​
// Solve it in O(n) time and O(1) extra space.
// Input: [3, 0, 1] → 2​
// Input: [0, 1] → 2​
// Input: [8,6,4,2,3,5,7,0,1] → 8

// (n*(n+1))/2 To compute the sum from 1 to n;
