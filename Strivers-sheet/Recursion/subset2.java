
//GOAl: ek diye gaye array ke saare UNIQUE subsets nikalna hai 
import java.util.*;

public class subset2 {
    public void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // result ki ek copy banayi

        for (int i = start; i < nums.length; i++) {

            // skip kara yaha pr
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]); // include kara

            backtrack(i + 1, nums, current, result); // recurse kara next index k liye

            // BACKTRACk: remove kara last element
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsetWithDuplicate(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {

        subset2 sol = new subset2();
        int[] nums = { 1, 2, 2 };

        List<List<Integer>> ans = sol.subsetWithDuplicate(nums);

        System.out.println("Unique subsets are: ");
        for (List<Integer> subset : ans) {
            System.out.print(subset + " ");
        }
        System.out.println();

    }
}
