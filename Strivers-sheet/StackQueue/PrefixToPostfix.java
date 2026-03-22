//Problem Statement: You are given a valid prefix expression consisting of binary operators and single-character operands. Your task is to convert it into a valid postfix expression.

import java.util.Stack;

public class PrefixToPostfix {
    public String prefixToPostfix(String prefix){
        Stack<String> s = new Stack<>();
        int n = prefix.length();

        for(int i = n - 1; i >= 0; i--){
            char c = prefix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else{
                String op1 = s.pop();
                String op2 = s.pop();

                s.push(op1 + op2 + c);
            }
        }

        return s.peek();
    }

    public static void main(String[] args) {
        PrefixToPostfix sol = new PrefixToPostfix();
        String prefix = "*-A/BC-/AKL";
        System.out.println("Postfix Expression: " + sol.prefixToPostfix(prefix));


    }
}
