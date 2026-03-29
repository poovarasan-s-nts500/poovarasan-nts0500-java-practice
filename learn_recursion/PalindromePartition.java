package learn_recursion;

import java.util.ArrayList;

public class PalindromePartition {
    public static boolean isPlaindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
        }
        return true;
    }

    public static List<List<String>> palindrome_partition() {

    }

    public static void main(String[] args) {
        String input = "aab";

        // ["a", "a", "b"]
        // check index 0 is palindrome
        // then 1 to length "ab" check palindrome no
        // NO --> index 0 from this string "ab"
        // check index 0 is palindrome

        // a,a,b
        // aa,b

        // aabb
        // a abb
        // a a bb
        // a a b b

    }
}
