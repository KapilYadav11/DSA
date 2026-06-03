public class pow2 {
    public boolean isPowerOfTwo(int n){
        return n > 0 &&(n & (n - 1)) == 0;
    }    

    public static void main(String[] args) {
        pow2 sol = new pow2();
        int num = 16;

        if (sol.isPowerOfTwo(num)) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }
}
