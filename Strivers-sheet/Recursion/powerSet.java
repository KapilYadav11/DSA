import java.util.*;

public class powerSet {
    private void helper(String s, int index, StringBuilder current, List<String> result){
        if(index == s.length()){
            result.add(current.toString());
            return;
        }
        current.append(s.charAt(index));
        helper(s, index + 1, current, result); // Include kara hai
        
        current.deleteCharAt(current.length() - 1); // backtracking OR Saaf safai

        helper(s, index + 1, current, result); // exclude kara hai
    }
    public List<String> getSubSequence(String s){
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        helper(s, 0, current, result);
        return result;
    }
    public static void main(String[] args) {
        String s = "abc";
        powerSet sol = new powerSet();
        List<String> subsequence = sol.getSubSequence(s);

        for (String subseq : subsequence) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}

