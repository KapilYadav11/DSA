//Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.
public class sortedArr {
    public boolean SearchSortedArr(int[] arr, int k){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == k){
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if(arr[low] <= k && k <= arr[mid]){
                    high = mid - 1;
                } else{
                    low = mid + 1;
                }
            } else{
                if (arr[mid] <= k && k <= arr[high]) {
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
        }
        return false;

    }
    public static void main(String [] args){
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;
        sortedArr sol = new sortedArr();
        boolean ans = sol.SearchSortedArr(arr, k);
        if (ans) {
            System.out.println("Target is present in the array");
        } else{
            System.out.println("Target is not present in the array");
        }

    }
}
