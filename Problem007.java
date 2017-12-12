public class Problem007 {
    public static void main(String[] args) {
        long n = 10001;
        System.out.println(nthPrime(n));
    }

    private static long nthPrime(long n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 2;
        }

        long count = 1;
        long testprime = 1;
        while (count < n) {
            testprime += 2;
            if (isPrime(testprime)) {
                count++;
            }
        }
        return testprime;
    }

    private static boolean isPrime(long x) {
        if (x % 2 == 0) {
            return false;
        }
        for (long factor = 3; factor * factor <= x; factor+=2) {
            if (x % factor == 0) {
                return false;
            }
        }
        return true;
    }
}
