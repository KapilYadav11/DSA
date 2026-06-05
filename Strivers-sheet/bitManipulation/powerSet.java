import java.util.*;
public class powerSet {
    public List<List<Integer>> getPowerSet(int[] nums){
        int n = nums.length;
        int subsets = 1 << n; // this line of code is equal to 2^n

        List<List<Integer>> ans = new ArrayList<>(); // list to store the subsets
        
        for(int num = 0; num < subsets; num++){ // iterate kr rahe hai 0 to 2^n-1 tk 

            List<Integer> subset = new ArrayList<>(); // temporary list hai jon store karegi subset ko
            for(int i = 0; i <n; i++){ // har ek bit pr iterate kr rahe hai 
                if((num & (1 << i)) != 0){
                    subset.add(nums[i]);
                }
            }
            ans.add(subset);

        }

        return ans;
    }

    public static void main(String[] args) {
         int[] nums = {1, 2, 3};

        powerSet sol = new powerSet();

        List<List<Integer>> subsets = sol.getPowerSet(nums);

        System.out.print("Initial Input Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Subsets:");
        for (List<Integer> subset : subsets) {
            System.out.print("[ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    
    }
}
