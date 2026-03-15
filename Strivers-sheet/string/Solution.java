public class Solution {

    public String removeOuterParanthesis(String s){
        StringBuilder result = new StringBuilder();
        int level = 0;

        for(char ch : s.toCharArray()){

            if(ch == '('){
                if(level > 0){
                    result.append(ch);
                }
                level++;
            }

            else if(ch == ')'){
                level--;
                if(level > 0){
                    result.append(ch);
                }
            }

        }

        return result.toString();
    }

    public static void main(String [] args){

        Solution sol = new Solution();
        String s = "(()())(())";

        String ans = sol.removeOuterParanthesis(s);

        System.out.println("The string after removing the parentheses is: " + ans);
    }
}