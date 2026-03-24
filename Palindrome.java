public class Palindrome {

    static boolean isPalindrome(String input) {
        // a -> 97 z -> 122
        // A -> 65 => 65+32 = 97 (a) Z -> 90 => 90+32 = 122 (z)

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            int left_ch_code = input.charAt(left);
            while (left_ch_code < 65 || left_ch_code > 122 || (left_ch_code > 90 && left_ch_code < 97)) {
                left++;
                left_ch_code = input.charAt(left);
            }

            int right_ch_code = input.charAt(right);
            while (right_ch_code < 65 || right_ch_code > 122 || (right_ch_code > 90 && right_ch_code < 97)) {
                right--;
                right_ch_code = input.charAt(right);
            }

            if (left_ch_code >= 65 && left_ch_code <= 90) {
                left_ch_code += 32;
            }
            if (right_ch_code >= 65 && right_ch_code <= 90) {
                right_ch_code += 32;
            }

            if (right_ch_code != left_ch_code)
                return false;

            right--;
            left++;

        }

        return true;
    }

    public static void main(String[] args) {
        // String input = "A man a plan a canal Panama";
        String input = "hello";

        System.out.println(isPalindrome(input));
    }
}

// Write a Java method that checks if a given string is a palindrome.​
// Ignore spaces, punctuation, and letter case.

// isPalindrome("A man a plan a canal Panama") → true​
// isPalindrome("racecar") → true​
// isPalindrome("hello") → false
