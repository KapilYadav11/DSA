// Problem Statement: Given an integer array nums, rotate the array to the left by one.

// Note: There is no need to return anything, just modify the given array.


public class rotateByOne {
   public void rotateLeftByOne(int[] arr){
    int n = arr.length;
    int temp = arr[0];
    for(int i = 1; i < n; i++){
        arr[i - 1] = arr[i]; // left shift kr rahe hai , variable k aandar store kar rahe hai
    }
    arr[n - 1] = temp;
   }
   public static void main(String[] args){
    int[] arr = {5,1,2,3,4};
    rotateByOne sol = new rotateByOne();
    sol.rotateLeftByOne(arr);
    
    for(int num : arr){
        System.out.println(num + " ");
    }
   } 
}
