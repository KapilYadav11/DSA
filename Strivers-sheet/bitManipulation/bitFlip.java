import java.util.*;
public class bitFlip {
    public int minBitFlip(int start, int goal){
        int num = start ^ goal;
        int cnt = 0;
        for(int i = 0; i < 32; i++){
            cnt += (num & 1);
            num = num >> 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int start = 10, goal = 7;
        bitFlip sol = new bitFlip();
        int ans = sol.minBitFlip(start, goal);
        System.out.println("The minimum bit flips to convert number is: " + ans);

    }
}