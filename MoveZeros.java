import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int pos = 0;
        int[] input = { 0, 1, 0, 3, 12 };
        int n = input.length;

        for (int i = 0; i < n; i++) {
            if (input[i] != 0) {
                input[pos++] = input[i];
            }
        }

        while (pos < n) {
            input[pos++] = 0;
        }

        System.out.println(Arrays.toString(input));
    }
}

// Q8. Move Zeroes​
// Write a Java method that moves all zeroes in an array to the end while
// maintaining the
// relative order of the non-zero elements. Do this in-place without creating a
// new array.
// Input: [0, 1, 0, 3, 12]​
// Output: [1, 3, 12, 0, 0]

// [0,1,0,3,12]​
// [1,0,0,3,12]
// [1,3,0,0,12]
// [1,3,12,0,0]
