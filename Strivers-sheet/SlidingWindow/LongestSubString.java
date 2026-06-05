import java.util.*;
public class LongestSubString {
    public int longestNonRepeatingSubString(String s){
        int n = s.length();
        int HashLen = 256;
        int[] hash = new int[HashLen];
        Arrays.fill(hash, -1);

        int r = 0, l = 0, maxLen = 0;
        while(r < n){
            if(hash[s.charAt(r)] >= l){ //Yeh line check karti hai ki kya yeh character pehle aa chuka hai aur kya woh hamari current window ke andar hai
                l = Math.max(hash[s.charAt(r)] + 1, l); // Agar repetition milti hai, toh hum left pointer l ko jump kara kar purane character ke theek ek index aage (+ 1) le aate hain.
            }

            int len = r - l + 1; //Yeh current window ki lambai nikalta hai.
            maxLen = Math.max(len, maxLen);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }

        public static void main(String[] args) {
        String s = "cadbzabcd";

        LongestSubString sol = new LongestSubString();

        int result = sol.longestNonRepeatingSubString(s);

        System.out.println("The maximum length is:");
        System.out.println(result);
    }

}

//BRUTE FORCE APPROACH
// import java.util.*;
// public class longestSubString {
//     public int  longestNonRepeatingSubString(String s){
//         int n = s.length();
//         int maxLength = 0;

//         for(int i = 0; i < n; i++){
//             int[] hash = new int[256];
//             Arrays.fill(hash, 0);

//             for(int j = i; j < n; j++){
//                 if(hash[s.charAt(j)] == 1){
//                     break;
//                 }
//                 hash[s.charAt(j)] = 1;

//                 int len = j - i + 1;
//                 maxLength = Math.max(maxLength, len);
//             }
//         }
//         return maxLength;
//     }

//     public static void main(String[] args) {
//          String input = "cadbzabcd";

//         longestSubString sol = new longestSubString();
//         int length = sol.longestNonRepeatingSubString(input);

//         System.out.println("Length of longest substring without repeating characters: " + length);
//     }
// }
