public class oddNum {
    public boolean isOdd(int n){
        return n % 2 != 0;
    }
    
    public static void main(String[] args){
        oddNum sol = new oddNum();
        int num = 9;

        if(sol.isOdd(num)){
            System.out.println(num + " is odd");
        } else{
            System.out.println(num + "is not odd");
        }
    }
}
