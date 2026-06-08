public class SubStringContain {
    public int numberOfSubString(String s){
        int[] freq = new int[3];
        int left = 0;
        int res = 0;

        for(int right = 0; right < s.length(); right ++){
            freq[s.charAt(right) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) { // shrink the window left se , jb saare character present ho
                res += (s.length() - right);  // count the substring from the right se lekar end tk 
                
                freq[s.charAt(left) - 'a']--; // left pointer ko move and freq ko update kara 
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        SubStringContain sol = new SubStringContain();
        int ans = sol.numberOfSubString(s);
        System.out.println("The answer is as: " + ans); 
    }
}

//BRUTE FORCE APPROACH
// public class SubStringContain {
//     public int numberOfSubString(String s){
//         int n = s.length();
//         int cnt = 0;
//         for(int i = 0; i < n; i++){
//             int[] freq = new int[3];

//             for(int j = i; j < n; j++){
//                 freq[s.charAt(j) - 'a']++;

//                 if(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }

//     public static void main(String[] args){
//         String s = "abcabc";
//         SubStringContain sol = new SubStringContain();
//         int res = sol.numberOfSubString(s);
//         System.out.println("The ans is: " + res);
//     }
// }
