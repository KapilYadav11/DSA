import java.util.*;
public class fourSum {
    public List<List<Integer>> findFourSum(int[] arr, int target){
        int n = arr.length;

        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                HashSet<Integer> seen =  new HashSet<>();
                for(int k = j + 1; k < n; k++){
                    long required = (long) target - arr[i] - arr[j] - arr[k];

                    if(seen.contains((int) required)){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) required);
                        Collections.sort(temp);
                        st.add(temp);
                    }

                    seen.add(arr[k]);
                }
            }
        }

        return new ArrayList<>(st);
    }
    public static void main(String [] args){
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        fourSum sol = new fourSum();
        List<List<Integer>> ans = sol.findFourSum(arr, target);
        for (List<Integer> result : ans) {
            System.out.println(result);
        }
    }
};
// the above solution is not fit for the leetcode :::: optimal solutions se hee answer shi aayega 



// BRUTE FORCE SOLUTION FOR THE 4 SUM QUESTION
// import java.util.*;
// public class fourSum {
//     public List<List<Integer>> findFourSum(int[] arr, int target){
//         int n = arr.length;

//         Set<List<Integer>> st = new HashSet<>();

//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 for(int k = j + 1; k < n; k++){
//                     for(int l = k + 1; l < n; l++){
//                         long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                        
//                         if(sum == target){
//                             List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
//                             Collections.sort(temp);
//                             st.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(st);
//     }
//     public static void main(String [] args){
//         int[] arr = {1, 0, -1, 0, -2, 2};
//         int target = 0;

//         fourSum sol = new fourSum();
//         List<List<Integer>> ans = sol.findFourSum(arr, target);
//         for (List<Integer> res : ans) {
//             System.out.println(res);
//         }
//     }
// }