public class Solution {

    public boolean checkIthBit(int n, int i){
        return (n & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 5;
        int bitIndex = 2;
         if (sol.checkIthBit(num, bitIndex)) {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is not set (0).");
        }
    }
}