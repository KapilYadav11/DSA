
//Insert at the head 
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
    
    public static class Solution {
        public Node insertAtHead(Node head, int newData){
            Node newNode = new Node(newData, head);
            return newNode;
        }

        public void printList(Node head){
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Node head = new Node(2);
        head.next = new Node(3);

        System.out.println("Original list");
        sol.printList(head);

        head = sol.insertAtHead(head, 1);

        System.out.println("After insertion at head");
        sol.printList(head);
    }

}



// public class Node {
//     int data;
//     Node next;

//     Node(int data1, Node next1){
//         this.data = data1;
//         this.next = null;

//     }

//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2,5,6,8};
//         Node y = new Node(arr[3]);
//         System.out.println(y.data);
//     }
// }
