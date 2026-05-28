import java.util.*;
public class consecutive1s {
    public static void generate(int n, String curr, List<String> result){
        if(curr.length() == n){
            result.add(curr);
            return;
        }

        generate(n, curr + "0", result);

        if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1'){
            generate(n, curr + "1", result);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        List<String> result = new ArrayList<>();
        consecutive1s sol = new consecutive1s();

        sol.generate(n, "", result);

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}