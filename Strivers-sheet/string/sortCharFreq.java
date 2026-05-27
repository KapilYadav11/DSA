// achhe se samajh  nhi aaya , try again and again


import java.util.*;
public class sortCharFreq {
    public List<Character> frequencySort(String s){
        Pair[] freq = new Pair[26];
        for(int i = 0; i < 26; i++){
            freq[i] = new Pair(0, (char)(i + 'a'));
        }
        for(char ch : s.toCharArray()){
            freq[ch - 'a'].freq++;
        }
        Arrays.sort(freq, (p1, p2) -> {
            if(p1.freq != p2.freq){
                return p2.freq - p1.freq;
            }
            return p1.ch - p2.ch;
        });

        List<Character> result = new ArrayList<>();

        for(Pair p : freq){
            if(p.freq > 0){
                result.add(p.ch);
            }
        }
        return result;
    }

    class Pair{
        int freq;
        char ch;
        Pair(int f, char c){
            this.freq = f;
            this.ch = c;
        }
    }

    public static void main(String[] args) {
        sortCharFreq sol = new sortCharFreq();
        String s = "tree";

        List<Character> result = sol.frequencySort(s);
        System.out.println(result);
    }
} 



// import java.util.*;

// class sortCharFreq{
//     public String frequencySort(String s) {
//         // Step 1: HashMap ka use karke har character ki frequency count karein
//         Map<Character, Integer> counts = new HashMap<>();
//         for (char ch : s.toCharArray()) {
//             counts.put(ch, counts.getOrDefault(ch, 0) + 1);
//         }

//         // Step 2: HashMap ki keys (characters) ko ek list mein daalein sort karne ke liye
//         List<Character> characters = new ArrayList<>(counts.keySet());

//         // Step 3: Custom sort lagayein
//         // Pehle frequency ke hisaab se descending order mein
//         // Agar frequency same hai, to ASCII/Alphabetical order mein ascending
//         Collections.sort(characters, (c1, c2) -> {
//             int freq1 = counts.get(c1);
//             int freq2 = counts.get(c2);
//             if (freq1 != freq2) {
//                 return freq2 - freq1; // Higher frequency first
//             }
//             return c1 - c2; // Alphabetical order if frequencies match
//         });

//         // Step 4: StringBuilder ka use karke output string taiyar karein
//         StringBuilder result = new StringBuilder();
//         for (char ch : characters) {
//             int count = counts.get(ch);
//             // Character ko uski frequency jitni baar repeat karein
//             for (int i = 0; i < count; i++) {
//                 result.append(ch);
//             }
//         }

//         return result.toString();
//     }
// }