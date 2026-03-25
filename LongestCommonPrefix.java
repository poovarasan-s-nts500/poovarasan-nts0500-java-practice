import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    static String common_prefix(ArrayList<String> input) {
        int n = input.size();
        if (n == 1)
            return input.get(0);

        StringBuilder common = new StringBuilder(input.get(0));

        for (int i = 1; i < n; i++) {
            int j = 0;
            while (j < input.get(i).length() && common.length() > j && common.charAt(j) == input.get(i).charAt(j))
                j++;

            common.delete(j, common.length());
            if (common.length() == 0)
                return "";
        }
        return common.toString();

    }

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(List.of("flower", "flowy", "flight"));
        System.out.println(common_prefix(input));
    }
}

// Q5. Longest Common Prefix​
// Write a Java method that finds the longest common prefix string among an
// array of
// strings.​
// If there is no common prefix, return an empty string.
// Input: ["flower", "flow", "flight"]​
// Output: "fl"​
// ​
// Input: ["dog", "racecar", "car"]​
// Output: ""
