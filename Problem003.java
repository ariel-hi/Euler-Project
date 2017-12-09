public class Problem003 {
    public static void main(String[] args) {
        long l = 600851475143l;
        System.out.println(largestPrimeFactor(l));
    }

    private static long largestPrimeFactor(long x) {
        if (x <= 1) {
            return -1;
        }
        if (x == 2) {
            return 2;
        }

        long start = (long) Math.sqrt(x);
        if (start % 2 == 0) {
            start ++;
        }

        long end = 2;
        long maxFactor = 0;
        for (long i = start; i > end; i-=2) {
            if (x % i == 0) {
                if (isPrime(i)) {
                    maxFactor = i;
                    break;
                }
            }
        }
        return maxFactor;
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
