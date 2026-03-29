import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

    public static boolean isvalid_parantheses(String input) {
        Stack<Character> parantheses = new Stack<>();
        Map<Character, Character> mapParantheses = Map.of(
                ')', '(',
                ']', '[',
                '}', '{');

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                parantheses.push(ch);
            else {

                char popped = parantheses.pop();
                if (mapParantheses.get(ch) != popped)
                    return false;

                // switch (ch) {
                // case ')':
                // if (popped != '(')
                // return false;
                // break;

                // case ']':
                // if (popped != '[')
                // return false;
                // break;

                // case '}':
                // if (popped != '{')
                // return false;
                // break;

                // default:
                // break;
                // }

            }
        }

        if (parantheses.size() > 0)
            return false;
        return true;

    }

    public static void main(String[] args) {
        String input = "(){}([]())";
        System.out.println(isvalid_parantheses(input));

    }
}

// Q20. Valid Parentheses​
// Write a Java method using a stack that checks whether a string containing (,
// ), {, }, [, ]
// is valid. A string is valid if brackets are correctly opened and closed in
// the right order.
// isValid("()") → true​
// isValid("()[]{}") → true​
// isValid("(]") → false​
// isValid("([)]") → false​
// isValid("{[]}") → true




