//Problem Statement: ou're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1]. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x


public class FloorCeil {
    public int findFloor(int[] arr, int x){
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] <= high){
                ans = arr[mid];
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public int findCeil(int[]arr, int x){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = ( low + high) / 2;
            if(arr[mid] >= high){
                ans = arr[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] findFloorCeil(int[] arr, int x){
        int f = findFloor(arr, x);
        int c = findCeil(arr, x);
        return new int[]{f,c};

    }

    public static void main(String [] args){
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        FloorCeil finder = new FloorCeil();
        int[] res = finder.findFloorCeil(arr, x);
         System.out.println("The floor and ceil are: " + res[0] + " , " + res[1]);
    }
}
