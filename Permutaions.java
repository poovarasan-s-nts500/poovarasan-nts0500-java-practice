import java.util.TreeSet;

public class Permutaions {

    static void combination(int index, char[] inputArr, TreeSet<String> output) {

        int n = inputArr.length;

        if (index == n) {
            output.add(String.valueOf(inputArr));
            return;
        }

        for (int i = index; i < n; i++) {
            char temp1 = inputArr[index];
            inputArr[index] = inputArr[i];
            inputArr[i] = temp1;

            combination(index + 1, inputArr, output);

            char temp2 = inputArr[index];
            inputArr[index] = inputArr[i];
            inputArr[i] = temp2;
        }
    }

    public static void main(String[] args) {
        String input = "BADC";
        TreeSet<String> output = new TreeSet<>(); // TreeSet for sort the answer

        char[] inputArr = input.toCharArray();

        combination(0, inputArr, output);

        output.forEach((permutaion) -> {
            System.out.println(permutaion);
        });

    }
}

// Q4. Find All Permutations of a String​
// Write a Java method that prints all unique permutations of a given string.
// Input: "abc"​
// Output: abc, acb, bac, bca, cab, cba

// ABC --> ['A', 'B', 'C']
// i and index combination(1, ['A', 'B', 'C']) i=0 Rem 1,2
// combination(2, ['A', 'B', 'C']) i=1, Remaining 2
// combination(3, ['A', 'B', 'C']) null
