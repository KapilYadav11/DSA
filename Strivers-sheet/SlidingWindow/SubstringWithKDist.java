import java.util.*;

public class SubstringWithKDist {
    public int lengthOfLongestSubStringKDistinct(String s, int k){
        int maxLength = 0;
        for(int i = 0; i <s.length(); i++){
            Map<Character, Integer> freq = new HashMap<>();

            for(int j = i; j < s.length(); j++){
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(i), null))
            }
        }
    }
}
