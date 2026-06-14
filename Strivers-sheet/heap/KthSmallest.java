import java.util.*;
public class KthSmallest {
    public int findKthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
        }

        for(int i = k; i < arr.length; i++){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        int ans = pq.peek();
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 20, 15};
        int k = 4;
        KthSmallest sol = new KthSmallest();
        int res = sol.findKthSmallestElement(arr, k);
        System.out.println("The kth smallest element is: " + res);
    }
};