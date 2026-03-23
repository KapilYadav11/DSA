// //Problem Statement: Given an array of non-negative integers representation elevation of ground. Your task is to find the water that can be trapped after rain .

public class trapWater {
    public int trap(int[] height){
        int n = height.length;

        int left = 0;
        int right = n - 1;

        int maxLeft = 0;
        int maxRight = 0;

        int totalWater = 0;
    
        // jab left chhota ho right se 
        while (left <= right) {

            // if left bar is chhoti than right bar 
            if(height[left] <= height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }
                else{
                    //Jab LEFT chhota ho:
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else{
                if(height[right] >= maxRight){
                    maxRight = height[right];
                } else{
                    //Jab RIGHT chhota ho:
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
    public static void main(String [] args){
        trapWater sol = new trapWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = sol.trap(height);
        System.out.println("Trapped water is " + ans);
    }
}
// Note:: “Jo side chhoti hai, us side ka max use karo”





// THE BRUTE FORCE APPROACH
// public class trapWater {
//     public int trap(int[] heigth){
//         int n = heigth.length;
//         int totalWater = 0;

//         for(int i = 0; i < n; i++){

//             int maxRight = 0;
//             int maxLeft = 0;
            
//             // // isse  maximum height to the left of current bar nikal lenge
//             for(int j = 0; j <= i; j++){
//                 if(heigth[j] > maxLeft){
//                     maxLeft = heigth[j];
//                 }
//             }
             
//             // isse  maximum height to the right of current bar nikal lenge
//             for(int j = i; j < n; j++){
//                 if(heigth[j] > maxRight){
//                     maxRight = heigth[j];
//                 }
//             }


//             totalWater += Math.min(maxLeft, maxRight) - heigth[i];
//         }

//         return totalWater;
//     }
//     public static void main(String [] args){
//         trapWater sol = new trapWater();
//         int[] heigth = {0,1,0,2,1,0,1,3,2,1,2,1};

//         int result = sol.trap(heigth);
//         System.out.println("Trapped water is as : " + result);
//     }
// }
