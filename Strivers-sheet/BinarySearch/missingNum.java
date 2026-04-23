// we  have to find the missing k number from the array (leetcode 1539)
public class missingNum {
    public int findMissingK(int[] arr, int k){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return k + high + 1;

    }
    public static void main(String [] args){
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        missingNum sol = new missingNum();
        int ans = sol.findMissingK(arr, k);
        System.out.println("The missing +ve number is: " + ans);

    }
}