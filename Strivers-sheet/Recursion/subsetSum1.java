import java.util.*;
public class subsetSum1 {
    public void findSum(int index, int currentSum, int[] arr, List<Integer> sum){
        if(index == arr.length){
            sum.add(currentSum);
            return;
        }
        // include kar rahe hai yaha pr 
        findSum(index + 1, currentSum + arr[index], arr,  sum);

        // exclude kr rahe hai
        findSum(index + 1, currentSum, arr, sum);
    }

    public List<Integer> subsetSums(int[] arr){
        List<Integer> sum = new ArrayList<>();
        findSum(0, 0, arr, sum);
        Collections.sort(sum);
        return sum;
    }

    public static void main(String[] args) {
        subsetSum1 sol = new subsetSum1();
        int[] arr = {5, 2, 1};
        List<Integer> result = sol.subsetSums(arr);
        for (int sum : result) {
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
