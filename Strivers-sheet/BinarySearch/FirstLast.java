//Problem Statement: Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key. If the target is not found then return -1. Note: Consider 0 based indexing

import java.util.Arrays;
import java.util.List;

public class FirstLast {
    
    public int findFirstAndLast(int n, int key, List<Integer> v){
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(v.get(mid) == key){
                res = mid;
                start = mid + 1;
            }
            else if (key < v.get(mid)) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;

    }
    
    public static void main(String [] args){
        int key = 13;
        List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        int n = v.size();
        FirstLast sol = new FirstLast();
        int ans = sol.findFirstAndLast(n, key, v);
        System.out.println(ans);
    }
}
