// lets take find the target element from the given array
public class find {
    public int findTarget(int[] arr, int target, int n){
    int low = 0, high = n - 1;
    while (low <= high) {
        int mid = (low + high) / 2;

        if(arr[mid] == target){
            return mid;
        }
        else if (target > arr[mid]) {
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
    return -1; 
}
    public static void main(String [] args){
        int[] arr = {3,4,6,7,9,12,16,17};
        int target = 6;
        int n = arr.length;
        find sol = new find();
        int ans = sol.findTarget(arr, target, n);
        System.out.println(ans);
    }
    
}
