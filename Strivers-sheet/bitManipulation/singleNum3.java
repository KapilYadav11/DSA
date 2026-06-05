import java.util.*;
public class singleNum3 {
    public int[] getSingleNumber(int[] nums){
        int n = nums.length;
        long XOR = 0;
        for(int i = 0; i < n; i++){
            XOR = XOR ^ nums[i]; // Har element ka XOR lete jao.
        }

        int rightMost = (int)(XOR & (XOR - 1)) ^ (int)XOR;
        int XOR1 = 0, XOR2 = 0;
        for(int i = 0; i < n; i++){
            if((nums[i] & rightMost) != 0){
                XOR1 = XOR1 ^ nums[i];
            }else{
                XOR2 = XOR2 ^ nums[i];
            }
        }
        if(XOR1 < XOR2) return new int[]{XOR1, XOR2};
        return new int[]{XOR1, XOR2};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 2};
        singleNum3 sol = new singleNum3();
        int[] ans = sol.getSingleNumber(nums);
        System.out.println("The single numbers in given array are: " + ans[0] + " and " + ans[1]);

    }
}




//One line remember tip ::: Pehle XOR se duplicates hatao, phir ek different bit pakdo, us bit ke basis par numbers ko do groups me baanto, aur dobara XOR karke dono unique numbers nikaal lo.