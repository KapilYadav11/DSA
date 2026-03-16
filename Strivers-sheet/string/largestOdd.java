public class largestOdd {
    public String largestOddNumber(String s){
        int index = -1;

        for(int i = s.length() - 1; i >= 0; i--){
            if((s.charAt(i) - '0') %2 ==1){
                index =i;
                break;
            }
        }
        if(index == -1){
            return "";
        }

        
        int i = 0; 
        while (i <= index && s.charAt(i) == '0') {
       i++;
       }

       return s.substring(i, index+1);
    }

    public static void main(String [] args){
        largestOdd sol = new largestOdd();
        String num = "35427";
        String result = sol.largestOddNumber(num);
        System.out.println("Largest odd number: " + result);
    }
}
