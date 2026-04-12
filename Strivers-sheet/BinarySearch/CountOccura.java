// Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

public class CountOccura {
    public static int[] findCountOccurance(int[] arr, int N, int target){
        int first = findFirst(arr, N, target);
        if(first == -1){
            return new int[] {-1,-1};
        }
        int last = findLast(arr, N, target);

        return new int[] {first, last};

    }

    public static int count(int[] arr, int N, int target){
        int[] ans = findCountOccurance(arr, N, target);
        if(ans[0] == -1){
            return 0;
        }
        return (ans[1] - ans[0] + 1);
    }

    public static int findFirst(int[] arr, int N, int target){
        int low = 0, high = arr.length;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return first;
    }

    public static int findLast(int[] arr, int N, int target){
        int low = 0, high = arr.length;
        int last = -1;
        while (low <= high) {
            int mid = low + (high -low) / 2;
            if(arr[mid] == target){
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return last;
        
    }

    public static void main(String [] args){
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int N = 8;
        int target = 8;
        int ans = count(arr, N, target);
        System.out.println("The number of occurance is : " + ans);
    } 
    
}
