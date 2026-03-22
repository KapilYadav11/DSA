//Problem Statement: Given a postfix expression (a string), convert it into an equivalent infix expression. The postfix expression is evaluated from left to right. The infix expression should have the proper parentheses to ensure correct operator precedence.

import java.util.Stack;

public class PostfixToInfix {
    public String postfixToInfix(String postfix){
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

                s.push("(" + op1 + c + op2 + ")");
            }
        }

        return s.peek();

    }
    public static void main(String[] args) {
    PostfixToInfix converter = new PostfixToInfix();
    String postfix = "AB*C+";
    System.out.println("Infix Expression: " + converter.postfixToInfix(postfix));
}
}