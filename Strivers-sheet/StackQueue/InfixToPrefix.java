import java.util.Stack;

public class InfixToPrefix {
    public static int priority(char C){
        if(C == '^'){
            return 3;
        }
        else if(C == '*' || C == '/'){
            return 2;
        }
        else if(C == '+' || C == '-'){
            return 1;
        }

        return 0;
    }

    public static String infixToPostfix(String infix){
        infix = '(' + infix + ')';
        Stack<String> s = new Stack<>();
        StringBuilder result = new StringBuilder();
        int n = infix.length();

        for(int i = 0; i < n; i++){
            char c = infix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }
            else if(c == '('){
                s.push("(");
            }
        }
    }

    public static void main(String [] args){
        String exp = "(p+q)*(c-d)";  // Infix expression
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix Expression: " + Solution.infixToPrefix(exp))

    }
}
