import java.util.*;

public class leaderArr {
    public ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();

        if(nums.length == 0){
            return ans;
        }
        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);

        return ans;


    }
    public static void main(String [] args){
        leaderArr sol = new leaderArr();
        int[] nums = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans = sol.leaders(nums);
         System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();

    }
}