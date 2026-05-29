import java.util.*;
public class generateParan {
    public void backtrack(String curr, int open, int close, int n, List<String> res){
        if(curr.length() == 2 * n){
            res.add(curr);
            return;
        }
        if(open < n){
            backtrack(curr + "(", open + 1, close, n, res);
        }

        if(close < open){
            backtrack(curr + ")", open, close + 1, n, res);
        }
    }

    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        backtrack("", 0, 0, n, res);
        return res;
    }

    public static void main(String[] args) {
        generateParan sol = new generateParan();
        List<String> result = sol.generateParenthesis(3);
        for(String s : result){
            System.out.println(s);
        }
    }
}

// BRUTE FORCE SOLUTION 
// import java.util.*;
// public class generateParan {
//     public boolean isValid(String s){
//         int bal = 0;
//         for(char c : s.toCharArray()){
//             if(c == '('){
//                 bal++;
//             }else{
//                 bal--;
//             }

//             if(bal < 0){
//                 return false;
//             }
//         }
//         return bal == 0;
//     }

//     public void generateAll(String curr, int n, List<String> res){
//         if (curr.length() == 2 * n) {
//             if(isValid(curr)) res.add(curr);
//             return;
//         }

//         generateAll(curr + "(", n, res);
//         generateAll(curr + ")", n, res);
//     }

//     public List<String> generateParenthesis(int n){
//         List<String> res = new ArrayList<>();
//         generateAll("", n, res);
//         return res;
//     }

//     public static void main(String[] args) {
//         generateParan sol = new generateParan();
//         List<String> result = sol.generateParenthesis(3);
//         for(String s : result){
//             System.out.println(s);
//         }
        
//     }
// }
