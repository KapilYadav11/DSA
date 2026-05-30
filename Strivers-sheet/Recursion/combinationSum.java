import java.util.*;
public class combinationSum {
    public static void findCombination(int index, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds)); // ds ki copy bana kr ans m daal rahe hain
            return;
        }
        if(index == arr.length || target < 0){
            return;
        }
          
        // PIck up ::: Agar current element target se chhotaa ya barabar hai
        if(arr[index] <= target){
            ds.add(arr[index]); // element ko ds m add kiya 

            findCombination(index, arr, target - arr[index], ds, ans);//yaha pr same index pass kr rahe hai taaki element reuse ho sake 

            ds.remove(ds.size() - 1); // BACKTRACK ;; wapas aate time elemnt ko remove kiya 
        }
     
        // NON-PICK :: element ko bina liye aagle index pr chale jao
        findCombination(index + 1, arr, target, ds, ans);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, arr, target, new ArrayList<>(), ans);

        System.out.println("Sari combinations jinka sum " + target + " hai:");
        System.out.println(ans);
    }
}