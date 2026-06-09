public class RemoveDuplicate {
    public int removeDuplicateEle(int[] arr){
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        int officer = 0;
        int unique = 0;
        int cm = 1;

        while(cm < n){
            if(arr[cm] == arr[cm - 1]){
                cm++;
                continue;
            }

            arr[officer + 1] =  arr[cm];
            officer++;
            unique++;
            cm++;
        }
        return unique + 1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3,3};
        RemoveDuplicate sol = new RemoveDuplicate();
        int ans = sol.removeDuplicateEle(arr);
        System.out.println("Total unique elements: " + ans);
        System.out.print("Modified Array: ");
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}