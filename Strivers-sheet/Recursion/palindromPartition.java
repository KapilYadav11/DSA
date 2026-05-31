// LEETCODE problem number is 131

import java.util.*;
public class palindromPartition {
    private void solve(int index, String s, List<String> path, List<List<String>> res){
        if (index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                solve(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end){
        while (start <= end) {
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }

    public List<List<String>> partition(String s){
        List<List<String>> res =new ArrayList<>();
        List<String> path = new ArrayList<>();
        solve(0, s, path, res);
        return res;
    }

    public static void main(String[] args) {
        palindromPartition sol = new palindromPartition();
        String input = "aab";
        System.out.println("Input String: " + input);
        
        List<List<String>> partitions = sol.partition(input);
        
        System.out.println("Palindrome Partitions:");
        System.out.println(partitions);
    }
}
