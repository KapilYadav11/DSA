import java.util.Stack;

public class RemoveKDigits {
    public String removeKDigits(String nums, int k){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < nums.length(); i++){
            char digit = nums.charAt(i);
            
            //Yeh line **pichle bade digits ko stack se hatati hai** jab tak use ek chota digit nahi mil jata (ya `k` khatam nahi ho jata), taaki number ki shuruat hamesha chote digits se ho sake.
            while(!s.isEmpty() && k > 0 && s.peek() > digit){
                s.pop();
                k--;
            }
            s.push(digit);
        }    
            
            //Yeh line stack ke **aakhri (rightmost) bade digits** ko hatati hai agar poori string traverse karne ke baad bhi `k` removals bache reh gaye hon.
            while (k > 0) {
                s.pop();
                k--;
            }

            if(s.isEmpty()){
                return "0";
            }

            StringBuilder res = new StringBuilder();

            while (!s.isEmpty()) {
                res.append(s.pop());
            }

            // Trim the leading zeros && ke baad ka code Yeh check karta hai ki kya aakhri character '0' hai? (Jo reverse hone ke baad sabse pehla digit banne wala hai)
            while (res.length() > 0 && res.charAt(res.length() - 1) == '0') {
                res.deleteCharAt(res.length() - 1);
            }
            res.reverse();
            if(res.length() == 0){
                return "0";
            }
            return res.toString();
        }
    
        
    
    public static void main(String [] args){
      RemoveKDigits sol = new RemoveKDigits();  
      String nums = "541892";
      int k = 2;
      String ans = sol.removeKDigits(nums, k);

      System.out.println("The smallest possible integer after removing k digits is: " + ans);
    }
}
