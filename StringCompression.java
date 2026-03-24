public class StringCompression {

    static String str_comparession(String input) {
        int n = input.length();
        if (n <= 1)
            return input;

        StringBuilder output = new StringBuilder();
        int i = 1;
        int count = 1;
        while (i < n) {
            char previous_ch = input.charAt(i - 1);
            char current_ch = input.charAt(i);

            if (previous_ch == current_ch) {
                count++;
            } else {
                output.append(previous_ch + "" + count);
                count = 1;
            }
            i++;
        }
        output.append(input.charAt(n - 1) + "" + count);
        return output.length() > n ? input : output.toString();
    }

    public static void main(String[] args) {
        String input = "abc";
        // String input = "aabcccdddd";

        System.out.println(str_comparession(input));

    }
}

// Implement a method that performs basic string compression using counts of
// repeated
// characters.​
// If the compressed string is not smaller than the original, return the
// original.

// Input: "aabcccdddd"​
// Output: "a2b1c3d4"​
// ​
// Input: "abc"​
// Output: "abc"