import java.util.*;
public class Element2 {
    public List<Integer> majorityElem2(int arr[]){
        int n = arr.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(cnt1 == 0 && el2 != arr[i]){
                cnt1 = 1;
                el1 = arr[i];
            } else if(cnt2 == 0 && el1 != arr[i]){
                cnt2 = 1;
                el2 = arr[i];
            } else if(arr[i] == el1){
                cnt1++;
            } else if(arr[i] == el2){
                cnt2++;
            } else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == el1){
                cnt1++;
            }

            if(arr[i] == el2){
                cnt2++;
            }
        }

        int mini = n / 3 + 1;
        List<Integer> result = new ArrayList<>();
        if(cnt1 >= mini){
            result.add(el1);
        }

        if(cnt2 >= mini && el1 != el2){
            result.add(el2);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        Element2 sol = new Element2();
        List<Integer> ans = sol.majorityElem2(arr);

        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}