public class NthRoot {
    public int findNthRoot(int n, int m){
        for(int i = 0; i <= m; i++){
            long power = (long)Math.pow(i, n);
            if(power == m){
                return i;
            }
            if(power > m){
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        NthRoot sol = new NthRoot();
        int n = 3, m = 27;
        System.out.println("Nth root is: " + sol.findNthRoot(n, m));
    }
}
