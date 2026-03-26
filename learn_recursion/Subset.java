package learn_recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void generate_subset_recursion(int[] arr,
            ArrayList<Integer> current_subset, int current_index, ArrayList<ArrayList<Integer>> subsets) {

        if (current_index == arr.length)
            return;

        current_subset.add(arr[current_index]);
        subsets.add(current_subset);
        System.out.println(current_index + " : " + current_subset.toString());
        generate_subset_recursion(arr, new ArrayList<>(List.copyOf(current_subset)), current_index++, subsets);

    }

    public static ArrayList<ArrayList<Integer>> generate_subset(int[] arr) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        System.out.println(subsets.toString());
        generate_subset_recursion(arr, new ArrayList<>(), 0, subsets);

        System.out.println(subsets.toString());
        return subsets;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        generate_subset(arr);
    }

}
// [1,2,3]

// Only move forward to prevent the duplicates
// [] -> [1] --> [1,2] [1,3]
// [2] --> [2,3]
// [1,2] --> [1,2,3]
//
//
