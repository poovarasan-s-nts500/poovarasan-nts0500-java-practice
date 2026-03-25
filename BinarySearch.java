public class BinarySearch {

    static int binary_search(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (right - left) / 2 + left;
            int val = arr[mid];
            if (val == target)
                return mid;
            else if (val > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int target = 141;

        System.out.println(binary_search(arr, target));
    }
}

// Q9. Binary Search​
// Implement binary search iteratively and recursively. The method should return
// the index
// of the target in a sorted array, or -1 if not found.
// Input: arr = [1, 3, 5, 7, 9, 11], target = 7​
// Output: 3