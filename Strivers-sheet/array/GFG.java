public class GFG {
    public static int missingNum(int[] nums){
        int n = nums.length;

        for (int i = 1; i <= n + 1; i++){
            boolean found = false;
            for(int j = 0; j < n ; j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,8};
        int missing = missingNum(nums);
        System.out.println("Missing Number is: " + missing);
    }
}