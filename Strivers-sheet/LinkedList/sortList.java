import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        data =data1;
        next = null;
    }
}
public class sortList {
    public Node findSortList(Node head){
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(arr);

        temp = head;
        for(int i = 0; i < arr.size(); i++){
            temp.data = arr.get(i);
            temp = temp.next;
        }
        return head;
    }
    
     public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }
     public static void main(String[] args) {
        // Creating a sample linked list
        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(4);

    
        System.out.print("Original Linked List: ");
        printLL(head);

       sortList sol = new sortList();
       head = sol.findSortList(head);

        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}
