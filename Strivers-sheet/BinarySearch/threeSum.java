import java.util.*;
public class threeSum {
    public List<List<Integer>> findThreeSum(int[] arr, int n){
        Arrays.sort(arr); // sort karenge
        List<List<Integer>> ans = new ArrayList<>(); // store karenge final result

        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i - 1]){
                continue; // skip duplicate for first elememt k liye
            }

            // two pointer apply karenge
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right + 1]) {
                        right++;
                    }
                }
                else if (sum < 0) {
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
    public static void main(String [] args){
        int[] arr =  {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        threeSum sol = new threeSum();
        List<List<Integer>> res = sol.findThreeSum(arr, n);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}


// YEH WALA CODE OPTIMAL SOLUTION K LIYE HAI
// import java.util.*;
// public class threeSum {
//     public List<List<Integer>> findThreeSum(int[] arr, int n){
//         Set<List<Integer>> st = new HashSet<>();
//         for(int i = 0; i < n; i++){
//             Set<Integer> hashset = new HashSet<>();
//             for(int j  = i + 1; j < n; j++){
//                 int third = -(arr[i] + arr[j]);

//                 if(hashset.contains(third)){
//                     List<Integer> temp =  Arrays.asList(arr[i], arr[j], third);
//                     Collections.sort(temp);
//                     st.add(temp);
//                 }

//                 hashset.add(arr[j]); // add karega current element set m 
//             }
//         } 
//         return new ArrayList<>(st);
//     }
//     public static void main(String [] args){
//         int[] arr = {-1, 0, 1, 2, -1, -4};
//         int n = arr.length;
//         threeSum sol = new threeSum();
//         List<List<Integer>> res = sol.findThreeSum(arr, n);

//         for (List<Integer> triplet : res) {
//              for (int num : triplet) System.out.print(num + " ");
//              System.out.println();
//         }
//     }
// }



// BRUTE FORCE SOLUTION HAI YE !!!
// import java.util.*;
// public class threeSum {
//     public List<List<Integer>> findThreeSum(int[] arr, int n){
        
//         Set<List<Integer>> st = new HashSet<>(); // help to store the unique triplet
//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 for(int k = j + 1; k < n; k++){
//                     if(arr[i] + arr[j] + arr[k] == 0){
//                         List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
//                         Collections.sort(temp);
//                         st.add(temp);
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(st);
//     }
//     public static void main(String [] args){
//         int[] arr = {-1, 0, 1, 2, -1, -4};
//         int n = arr.length;
//         threeSum sol = new threeSum();
//          List<List<Integer>> res = sol.findThreeSum(arr, n);

//         for (List<Integer> triplet : res) {
//             for (int num : triplet) System.out.print(num + " ");
//             System.out.println();
//         }
//     }
// }