
// import java.util.ArrayList;
// import java.util.List;

// public class CombinationSum {

//     public static void generate_combination_sum(int index, int[] input, int target, ArrayList<Integer> current_values,
//             List<List<Integer>> combinations) {

//         if (index == input.length) {
//             if (target == 0) {
//                 combinations.add(new ArrayList<>(current_values));
//             }
//             return;
//         }

//         if (input[index] <= target) {
//             current_values.add(input[index]);
//             generate_combination_sum(index, input, target - input[index], current_values, combinations);
//             current_values.removeLast();
//         }
//         generate_combination_sum(index + 1, input, target, current_values, combinations);

//     }

//     public static List<List<Integer>> combination_sum(int[] input, int target) {
//         List<List<Integer>> combinations = new ArrayList<>();
//         generate_combination_sum(0, input, target, new ArrayList<>(), combinations);
//         return combinations;
//     }

//     public static void main(String[] args) {
//         int[] input = { 2, 5, 1, 7, 1 };
//         int target = 7;
//         List<List<Integer>> combinations = combination_sum(input, target);

//         System.out.println(combinations.toString());
//     }
// }

// --------------------------  Duplicates also handled by sort the array before finding Combination ----------------

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void generate_combination_sum(int index, int[] input, int target, ArrayList<Integer> current_values,
            List<List<Integer>> combinations) {

        if (index < input.length - 1 && input[index] == input[index + 1]) {
            generate_combination_sum(index + 1, input, target, current_values, combinations);
            return;
        }

        if (index == input.length) {
            if (target == 0) {
                combinations.add(new ArrayList<>(current_values));
            }
            return;
        }

        if (input[index] <= target) {
            current_values.add(input[index]);
            generate_combination_sum(index, input, target - input[index], current_values, combinations);
            current_values.removeLast();
        }
        generate_combination_sum(index + 1, input, target, current_values, combinations);

    }

    public static List<List<Integer>> combination_sum(int[] input, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        generate_combination_sum(0, input, target, new ArrayList<>(), combinations);
        return combinations;
    }

    public static void main(String[] args) {
        int[] input = { 2, 5, 1, 7, 1 };
        int target = 7;
        Arrays.sort(input);
        List<List<Integer>> combinations = combination_sum(input, target);

        System.out.println(combinations.toString());
    }
}

// If using negative values in input the output will be infinate
// [2, -1] target = 3 ==> [2,2,-1] [2,2,2,-1,-1,-1] etc So positive only