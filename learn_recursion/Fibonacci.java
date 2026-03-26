package learn_recursion;
import java.util.HashMap;

public class Fibonacci {

    // 0 1 1 2 3 5 8

    public static int fibonacci(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n))
            return memo.get(n);

        int val = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        memo.put(n, val);
        return val;

    }
    // fib(4) -> fib(3) + fib(2) --> 2+1 = 3
    // fib(3) -> fib(2) + fib(1) --> 1+1 = 2
    // fib(2) -> fib(1) + fib(0) --> 1+0 = 1

    // fib(4) -> fib(3) + fib(2) --> 1+1 = 2
    // fib(3) -> fib(2) + fib(1) --> 1+0 = 1
    // fib(2) -> fib(1) + fib(0) --> 1+0 = 1
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 0);
        memo.put(2, 1);
        System.out.println(fibonacci(6, memo));

    }
}
