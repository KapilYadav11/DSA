import java.util.Stack;

public class InfixTooPostfix {

    public static int prece(char c){
        if(c == '^')
            return 3;
        else if(c == '/' || c == '*')
            return 2;

        else if(c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    public static void infixToPostfixConver(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }

            else if(c == '('){
                st.push('(');
            }

            else if(c == ')'){
                while (st.peek() != '(') {
                    result.append(st.pop());
                }

                st.pop();
            }

            else{
                while (!st.isEmpty() && prece(c) <= prece(st.peek())) {
                    result.append(st.pop());
                }

                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        System.out.println("Postfix Expression: " + result.toString());

    }
    
    public static void main(String [] args){
        String exp = "(p+q)*(m-n)"; 
        System.out.println("Infix expression " + exp);
        System.out.println(exp);
    }
}
