public class peakElement {
    public int findPeakElement(int[] nums){
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[mid + 1]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int[] nums =  {1, 2, 1, 3, 5, 6, 4};
        peakElement sol = new peakElement();
        int ans = sol.findPeakElement(nums);
        System.out.println("The index of peak ellement from the array is as: " + ans);
    }
}
