public class countGood {
  
    private long power(long x, long y, long mod){
        long res = 1;
        x = x % mod;
        while(y > 0){
            if((y & 1 ) == 1){
                res = ( res * x) % mod;
            }
            y = y >> 1;
            x = (x * x)% mod;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long MOD = 1000000007;
        long evenCount = (n + 1)/2;
        long oddCount = n / 2;
        long choiceEven = power(5, evenCount, MOD);
        long choiceOdd = power(4, oddCount, MOD);
        return (int) ((choiceEven * choiceOdd) % MOD);
    }

    public static void main(String[] args) {
        countGood sol = new countGood();
        long n = 5;
        int result = sol.countGoodNumbers(n);
        System.out.println("Good number after counting is: " + result);
    }

}
