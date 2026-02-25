//Problem Statement: Given an array, we have to find the largest element in the array.


public class largestElement {
    public static int findLargestElement(int [] arr1, int n){
        int max = arr1[0];
        for(int i = 1; i<n; i++){
            if(arr1[i] > max){
               max = arr1[i];
            }
        }
        return max;

    }
    
    public static void main(String [] args){
        int [] arr1 = {2, 5, 9, 0, 8};
        int n = arr1.length;
        int max = largestElement.findLargestElement(arr1, n);
        System.out.println("The largest element in arr1 is " + max);
    }
}
