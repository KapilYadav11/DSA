public class swapper {
    public void swapXOR(int[] arr){
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }

    public static void main(String[] args){
        swapper sol = new swapper();
        int[] num = {5, 10};
        sol.swapXOR(num);

        System.out.println("a = " + num[0] + ", b = " + num[1]);
    }
}
