import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // System.out.print("Enter the String to Reverse words: ");
        // String input = in.nextLine();
        // System.out.println();


        String input = " Hey one!      Bye";
        StringBuilder output = new StringBuilder("");
        int wordLastIndex = input.length() - 1;
        int wordFirstIndex = wordLastIndex;
        while (wordFirstIndex >= 0) {
            char ch = input.charAt(wordFirstIndex);
            if (ch == ' ') {
                if (wordFirstIndex != wordLastIndex) {
                    output.append(input.substring(wordFirstIndex + 1, wordLastIndex + 1));
                }
                output.append(ch);
                wordLastIndex = --wordFirstIndex;
            } else {
                if (wordFirstIndex == 0 && wordFirstIndex != wordLastIndex) {
                    output.append(input.substring(wordFirstIndex, wordLastIndex + 1));
                }
                wordFirstIndex--;
            }

        }
        System.out.println(output);
        System.out.println(input);
        in.close();

    }
}

// Write a Java method that reverses the order of words in a given sentence.​
// Punctuation and multiple spaces should be handled.

// Input: "Hello World Java"​
// Output: "Java World Hello"

// ---------------

// TEST CASES

// Input: "Hello, Hi how are you?"
// Output: "you? are how Hi Hellow,"

// Input: ""
// Output: ""

// Input: " Hey one Bye"
// Output: "Bye one Hey "

// -----------------

// APPROCH
    // Start with end of the String 
    // If the current character is space
        // check the first and last index isn't same then append the substring
        // Append space and decrement the firstIndex also assign it to last index always if the current index charater is space
    // If the current character is not space then move the firstIndex to left by decrement. If the firstIndex is reached the 0th index then append the current substring
