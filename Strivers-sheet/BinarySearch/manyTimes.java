public class manyTimes {
    public int findHowManyTimes(int[] arr){
        int n = arr.length;
        int minVal = arr[0];
        int minIndex = 0;
        
        for(int i = 1; i < n; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
                minIndex = i;
            }
        }
        return minIndex;

    }
    public static void main(String[] args) {
        int[] arr = {Z5,4,3,1,2};
        manyTimes sol = new manyTimes();
        int result = sol.findHowManyTimes(arr);
        System.out.println("The no of times rotation is as : " + result);
    }
}
