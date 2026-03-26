public class SpiralOrderTraversal {

    public static void print_spiral_order(int[][] matrix) {
        // int i = 0;
        int cols = matrix[0].length;
        int rows = matrix.length;
        int left = 0, right = cols, top = 0, bottom = rows;

        while (left < right) {
            System.out.print(matrix[top][left++] + " ");
        }
        top++;
        right--;

        while (top < bottom) {
            System.out.print(matrix[top++][right] + " ");
        }

        bottom--;
        left--;
        while (top < bottom) {
            System.out.print(matrix[top++][right] + " ");
        }

        // while (left < right) {
        // System.out.print(matrix[top][left++] + " ");
        // }
        // top++;
        // right--;

        // while (top < bottom) {
        // System.out.print(matrix[top++][right] + " ");
        // }

        // while (right < left) {

        // }

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        print_spiral_order(matrix);
    }
}

// Q16. Spiral Order Traversal​
// Write a Java method that prints the elements of an M×N matrix in spiral order
// (clockwise
// from the outside in).
// Input:​
// 1 2 3​
// 4 5 6​
// 7 8 9​
// ​
// Output: 1 2 3 6 9 8 7 4 5

// 00 01 02 03 04 05 --> Left to Right
// 15 25 35 --> Top to Bottom
// 34 33 32 31 30 --> Right to Left
// 20 10 --> Bottom to Top
// 11 12 13 14 --> Left to Right
// 24 --> Top to Bottom
// 23 22 21 --> Right to Left