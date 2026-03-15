// Problem Statement: Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space. Return a string with the words in reverse order, concatenated by a single space.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class revString {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            String word = s.substring(i + 1, end + 1);

            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(word);

        }
        return result.toString();
    }

    public static void main(String[] args) {
        revString sol = new revString();
        String s = " Amazing coding skills ";

        String ans = sol.reverseString(s);

        System.out.println("The reverse of the string is as :" + ans);

    }
}

// THE BRUTE FORCE APPROACH
// public class revString {
// public String reverseString(String s){
// List<String> words = new ArrayList<>();
// StringBuilder word = new StringBuilder();

// for(int i = 0; i < s.length(); i++){
// if(s.charAt(i) != ' '){
// word.append(s.charAt(i));
// }

// else if(word.length() > 0){
// words.add(word.toString());
// word.setLength(0);
// }
// }

// if(word.length() > 0){
// words.add(word.toString());
// }

// Collections.reverse(words);

// return String.join(" ", words);

// }
// public static void main(String [] args){
// revString sol = new revString();
// String s = " amazing coding skills ";
// String ans = sol.reverseString(s);

// System.out.println("The reverse of the string is as follows : " + ans);
// }
// }
