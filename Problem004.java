public class Problem004 {
    public static void main(String[] args) {
        System.out.println(largestPalindrome(3));
    }

    private static int largestPalindrome(int digits) {
        int start = (int) Math.pow(10, digits - 1);
        int end = (int) Math.pow(10, digits);

        int maxProd = 0;
        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {
                int prod = i * j;
                if (prod > maxProd && isPalindrome(prod)) {
                    maxProd = prod;
                }
            }
        }
        return maxProd;
    }

    private static boolean isPalindrome(int x) {
        String xstr = "" + x;
        for (int i = 0; i < xstr.length()/2; i++) {
            if (xstr.charAt(i) != xstr.charAt(xstr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
