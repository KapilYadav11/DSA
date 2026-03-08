//Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array..


public class maxConse {
    public int maxConseNum(int[] nums){
        int n = nums.length;
        int cnt = 0;
        int maxi = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                cnt++;
            } else{
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
           
        }
         return maxi;

    }

    public static void main(String [] args){
        maxConse sol =  new maxConse();
        int[] nums = {1,1,0,0,1,0,0,0,1,1,1,};
        int ans = sol.maxConseNum(nums);

        System.out.println("The maximum consecutive number is:" + ans);

        
    }
}
