//Problem Statement: Given the head of a singly linked list, write a program to reverse the linked list, and return the head pointer to the reversed list.
import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
 
public class reverseList {
    public ListNode reversedList(ListNode head){ 
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }

    public static void main(String [] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reverseList sol = new reverseList();
        ListNode newHead = sol.reversedList(head);

        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();
    }

    
}



 //BRUTE FORCE APPROACH
// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(int x){
//         val = x;
//         next = null;
//     }
// }

// public class reverseList {
//     public ListNode reversedList(ListNode head){
//         Stack<Integer> stack = new Stack<>();
//         ListNode temp = head;
//         while (temp != null) {
//             stack.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;
//         while ( temp != null) {
//             temp.val = stack.pop();
//             temp = temp.next;
//         }
//         return head;

//     }
//     public static void main(String [] args){
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         reverseList sol = new reverseList();
//         head = sol.reversedList(head);

//         while (head != null) {
//             System.out.println(head.val + " ");
//             head = head.next;
//         }

//     }
// }