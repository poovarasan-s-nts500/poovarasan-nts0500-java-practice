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
        if (exp == 0)
            return 1;

        if (exp == 1)
            return base;

        int half = exponentiation_by_squaring(base, exp / 2);
        
        if (exp % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }

    }

    public static void main(String[] args) {
        int base = 0;
        int exp = 2;
        // System.out.println(power(base, exp));
        System.out.println(exponentiation_by_squaring(base, exp));
    }
}

// Q11. Power of a Number​
// Write a recursive Java method power(base, exp) that computes base^exp
// efficiently
// using the "fast exponentiation" (exponentiation by squaring) approach.
// power(2, 10) → 1024​
// power(3, 5) → 243

// APPROCH
// n is even then a^n = (a ^ n/2) ^ 2
// n is odd then a^n = a * a^n-1 --> its just -1 to get a even number