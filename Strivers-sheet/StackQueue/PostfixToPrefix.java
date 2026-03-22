//Problem Statement: You are given a valid postfix expression as a string, where:
// Operands are single lowercase English letters ('a' to 'z')
// Operators are binary: '+', '-', '*', '/'
// The expression contains no spaces and is guaranteed to be valid.

import java.util.Stack;

public class PostfixToPrefix {
    public String postfixToPrefix(String postfix){
        Stack<String> s = new Stack<>();
        int n = postfix.length();

        for(int i = 0; i < n; i++){
            char c = postfix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else{
                String op1 = s.pop();
                String op2 = s.pop();

                s.push(c + op1 + op2);
            }
        }
        return s.peek();
    }
    public static void main(String[] args) {
    PostfixToPrefix converter = new PostfixToPrefix();
    String postfix = "ABC/-AK/L-*";
    System.out.println("Prefix Expression: " + converter.postfixToPrefix(postfix));
    }

    
}
