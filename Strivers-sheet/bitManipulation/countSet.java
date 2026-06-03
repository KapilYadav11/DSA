public class countSet {
    public int countSetBit(int n){
        int count = 0;

        while(n > 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n  = 29;
        countSet sol = new countSet();
        int result = sol.countSetBit(n);
        System.out.println("The number of set bit is: " + result);
    }
}
