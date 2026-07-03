public class StringToInt {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        
        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Agar string sirf spaces ki hai
        if (i == n) return 0;
        
        // 2. Check for sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // 3. Convert digits to integer
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            // 4. Overflow/Underflow check (Clamping)
            // Agar number limit cross kar raha hai
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return (int) (result * sign);
    }
     public static void main(String[] args) {
        StringToInt sol = new StringToInt();
        String s = "   -12345";
        System.out.println(sol.myAtoi(s)); // Output: -12345
    }
}
