//Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.


//THE BELOW CODE IS THE OPTIMAL APPROACH
public class sortArray {
    // Ye function array ko sort karega jisme sirf 0, 1, aur 2 honge
    public void sortZeroOneTwo(int[] nums) {

        // 3 pointers initialize kar rahe hain
        // low -> 0 ke liye position
        // mid -> current element check karne ke liye
        // high -> 2 ke liye position
        int low = 0, mid = 0, high = nums.length - 1;

        // Jab tak mid pointer high ko cross nahi karta tab tak loop chalega
        while (mid <= high) {

            // Agar current element 0 hai
            if (nums[mid] == 0) {

                // nums[low] aur nums[mid] ko swap karenge
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                // swap hone ke baad low aur mid dono aage badhenge
                low++;
                mid++;
            }

            // Agar current element 1 hai
            else if (nums[mid] == 1) {

                // 1 already sahi position ke zone me hai
                // isliye sirf mid pointer aage badhega
                mid++;
            }

            // Agar current element 2 hai
            else {

                // nums[mid] aur nums[high] ko swap karenge
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                // swap ke baad high pointer peeche aayega
                // mid ko move nahi karte kyunki swapped element check karna hai
                high--;
            }
        }
    }




    public static void main(String[] args) {
       sortArray obj = new sortArray();

        int[] nums = {2, 0, 2, 1, 1, 0};
        obj.sortZeroOneTwo(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}    





// THE BELOW CODE IS THE BETTER APPROACH
// public class sortArray {
//     public void sortZeroOneTwo(int[] nums){
//         int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//         // Count
//         for(int num : nums){
//             if(num == 0) cnt0++;
//             else if(num == 1) cnt1++;
//             else cnt2++;
//         }

//         // Fill 0s
//         for(int i = 0; i < cnt0; i++){
//             nums[i] = 0;
//         }

//         // Fill 1s
//         for(int i = cnt0; i < cnt0 + cnt1; i++){
//             nums[i] = 1;
//         }

//         // Fill 2s
//         for(int i = cnt0 + cnt1; i < nums.length; i++){
//             nums[i] = 2;
//         }
//     }

//     public static void main(String [] args){
//         sortArray sol = new sortArray();
//         int[] nums = {2,1,2,1,2,0,1,0,2,1,2,1,0,0,0,1};

//         sol.sortZeroOneTwo(nums);

//         System.out.println("After sorting:");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }






//THE BELOW CODE IS THE BRUTE FORCE 
// public class sortArray {
//     public void sortZeroOneTwo(int[] nums){
//         int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//         for(int num : nums){
//             if(num == 0) cnt0++;
//             else if(num == 1)cnt1++;
//             else cnt2++;
//         }

//         //Ye batata hai ki array me kis position par value insert karni hai.
//         int index = 0;

//         while (cnt0-- > 0) {
//             nums[index++] = 0;
//         }

//         while (cnt1-- > 0) {
//             nums[index++] = 1;
//         }

//         while (cnt2-- > 0) {
//             nums[index++] = 2;
//         }

//     }
//     public static void main(String[] args){
//         sortArray sol = new sortArray();
//         int[] nums = {1,2,0,1,2,0,0,0,1,2,0,1,1};

//         sol.sortZeroOneTwo(nums);

//         for(int num : nums){
//             System.out.print(num + " ");
//         }

//     }
// }
