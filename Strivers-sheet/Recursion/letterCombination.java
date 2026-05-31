import java.util.*;
public class letterCombination {
    private final String[] map;
    public letterCombination(){
        map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }

    private void solve(String digits, List<String> ans, int index, String current){
        if(index == digits.length()){
            ans.add(current);
            return;
        }

        String s = map[digits.charAt(index) - '0'];

        for(int i = 0; i < s.length(); i++){
            solve(digits, ans, index + 1, current + s.charAt(i));
        }
    }

    public List<String> findLetterCombination(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        solve(digits, ans, 0, "");
        return ans;
    }

    public static void main(String[] args) {
        letterCombination sol = new letterCombination();
        String digit = "23";
        List<String> result = sol.findLetterCombination(digit);
        for (String combination : result) {
            System.out.print(combination + " "); 
        }
    }
}