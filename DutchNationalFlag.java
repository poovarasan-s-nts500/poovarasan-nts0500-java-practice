import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] input = { 2, 0, 2, 1, 1, 0, 0 };

        int _0s = 0;
        int _1s = 0;
        int _2s = 0;

        for (int val : input) {
            if (val == 0)
                _0s++;
            else if (val == 1)
                _1s++;
            else
                _2s++;
        }

        for (int i = 0; i < _0s; i++)
            input[i] = 0;

        for (int i = _0s; i < _0s + _1s; i++)
            input[i] = 1;

        for (int i = _0s + _1s; i < _0s + _1s + _2s; i++)
            input[i] = 2;

        System.out.println(Arrays.toString(input));

    }
}

// Q23. Dutch National Flag Problem​
// Given an array with values only 0, 1, and 2 (representing red, white, and
// blue), sort the
// array in-place in a single pass without using any sorting library function.
// Input: [2, 0, 2, 1, 1, 0]​
// Output: [0, 0, 1, 1, 2, 2]