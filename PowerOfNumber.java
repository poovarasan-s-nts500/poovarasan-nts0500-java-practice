import java.util.ArrayList;
import java.util.HashMap;

public class PowerOfNumber {

    public static int power(int base, int exp) {
        if (base == 0)
            return 0;
        int output = 1;

        while (exp > 0) {
            output *= base;
            exp--;
        }

        return output;
    }

    public static int pow(int base, int updatingExp) {
        return 0;
    }

    public static int exponentiation_by_squaring(int base, int exp) {
        if (base == 0)
            return 0;

        ArrayList<Integer> binaryDigits = new ArrayList<>();

        // 120 1 2 4 8 16 32 64
        // 1111000

        // 6^14
        // 14 -> 0111 --> 1110 8 4 2
        // 6^1 = 6
        // 6^2 = 36
        // 6^4 = 36^36 1296
        // 6^8 = 1296^1296 1679616

        // 1679616 * 1296 * 36

        HashMap<Integer, Integer> powerAndValue = new HashMap<>();
        int updatingExp = 1;
        while (updatingExp < exp) {
            powerAndValue.put(updatingExp, base);
        }

        return 0;
    }

    public static void main(String[] args) {
        int base = 0;
        int exp = 0;
        System.out.println(power(base, exp));
    }
}

// Q11. Power of a Number​
// Write a recursive Java method power(base, exp) that computes base^exp
// efficiently
// using the "fast exponentiation" (exponentiation by squaring) approach.
// power(2, 10) → 1024​
// power(3, 5) → 243