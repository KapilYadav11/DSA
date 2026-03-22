//Problem Statement: You are given a valid arithmetic expression in prefix notation. Your task is to convert it into a fully parenthesized infix expression.
//Prefix notation (also known as Polish notation) places the operator before its operands. In contrast, infix notation places the operator between operands.

import java.util.Stack;

public class PrefixToInfix {
    public String prefixToInfix(String prefix){
        Stack<String> s = new Stack<>();
        int n = prefix.length();

        for(int i = n-1; i >= 0; i-- ){
            char c = prefix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            } 
            else{
                String op1 = s.pop();
                String op2 = s.pop();

                s.push("(" + op1 + c + op2 + ")");
            }
        }

        return s.peek();

    }
    public static void main(String [] args){
        PrefixToInfix sol = new PrefixToInfix();
        String prefix = "*-A/BC-/AKL";
        String result = sol.prefixToInfix(prefix);
        System.out.println("After the conversion the infix expression is : " + result);
    }
}
