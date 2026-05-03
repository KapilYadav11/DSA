import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}
public class removeNthNode {
    public Node findDeleteNthNode(Node head, int n){
        if(head == null){
            return null;
        }
        int cnt = 0;
        Node temp = head;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        if(cnt == n){
            return head.next;
        }

        int res = cnt - n;
        temp = head;

       for (int i = 1; i < res; i++) {
        temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    public void printLL(Node head){
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String [] args){
        List<Integer> arr =  Arrays.asList(1, 2, 3, 4, 5);
        int n = 3;
        
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));

        removeNthNode sol = new removeNthNode();
        head = sol.findDeleteNthNode(head, n);
        sol.printLL(head);
    }
}