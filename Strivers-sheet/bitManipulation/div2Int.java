public class div2Int {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isPositive = (dividend >= 0) == (divisor >= 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {
            long temp = d;
            long multiple = 1;

            while (n >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            n -= temp;
            ans += multiple;
        }

        return isPositive ? (int) ans : (int) -ans;
    }


    public static void main(String[] args) {
        int dividend = 10, divisor = 3;
        div2Int sol = new div2Int();
        int ans = sol.divide(dividend, divisor);
        
        System.out.println("The result of dividing " + dividend + " and " + divisor + " is " + ans);
    }
}

