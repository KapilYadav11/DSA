public class setRightMost {
    public static int setRightMostUnsetBit(int n){
        return n | (n + 1);
    }

    public static void main(String[] args) {
        setRightMost sol = new setRightMost();
        int n = 10;
        int res = sol.setRightMostUnsetBit(n);
        System.out.println("Number after setting rightmost unset bit: " + res); // Output: 11

    }
}
