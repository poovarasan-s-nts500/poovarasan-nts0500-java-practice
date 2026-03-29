import java.util.Arrays;

public class TransposeMatrix {
    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
    // 00 01 02 03
    // 11 12 13
    // 22 23
    // 33

    // 00 01 02 03
    // 10 11 12 13
    // 20 21 22 23
    // 30 31 32 33

    // After Transpose the First line
    // 00 10 20 30
    // 01
    // 02
    // 03

    // We need to transpose now the reamaining
    // -- -- -- --
    // -- 11 12 13
    // -- 21 22 23
    // -- 31 32 33

    // Next Remaining
    // -- -- -- --
    // -- -- -- --
    // -- -- 22 23
    // -- -- 32 33

    // Next
    // -- -- -- --
    // -- -- -- --
    // -- -- -- --
    // -- -- -- 33

    // The pattern (Loops starts in the diagonal place like 00, 11, 22, ...)
    // 00 01 02 03
    // 11 12 13
    // 22 23
    // 33
}

// Q15. Transpose a Matrix​
// Write a Java method that transposes an N×N matrix in-place (without creating
// a new
// matrix).
// Input:​
// 1 2 3​
// 4 5 6​
// 7 8 9​
// ​
// Output:​
// 1 4 7​
// 2 5 8​
// 3 6 9