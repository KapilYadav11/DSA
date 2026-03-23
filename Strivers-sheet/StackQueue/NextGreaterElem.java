//Problem Statement: Given an integer array A, return the next greater element for every element in A. The next greater element for an element x is the first element greater than x that we come across while traversing the array in a clockwise manner. If it doesn't exist, return -1 for this element.
import java.util.Stack;

public class NextGreaterElem {
    public int[] findNextGreaterElement(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];

        for(int i = n - 1; i >= 0; i--){
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res;

    }
    public static void main(String [] args){
        int[] nums = {4,5,2,10};
        NextGreaterElem sol = new NextGreaterElem();
        int[] ans = sol.findNextGreaterElement(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();

    }
}