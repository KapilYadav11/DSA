public class MaxParan {
    public int maxDepthParan(String s){
        int p = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                p++;
            }else if(ch == ')'){
                p--;
            }
            ans = Math.max(ans, p);
        }
        return ans;
    }
    public static void main(String[] args) {
        MaxParan sol = new MaxParan();
        String s  = "(1+(2*3)+((8)/4))+1";
        int result = sol.maxDepthParan(s);
        System.out.println("Max Depth of Paranthesis:" + result);
    }
}
