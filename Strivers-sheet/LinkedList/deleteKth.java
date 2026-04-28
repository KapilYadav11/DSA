class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next= null;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class deleteKth {
    public static Node findKthDelete(Node head, int k){
        // Case 1: Agar list khali hai
        if(head == null){
            return head;
        }

        // Case 2: Agar head (k=1) ko delete karna hai
        if(k == 1){
            Node temp = head;
            head = head.next; // head ko agle nod pr move kiya 
            return head;
        }

        // case-3 : Middle ya Last node delete karna ho
        Node prev = head;
        int cnt = 1;

        // k-1 tk traverse karenge
        while (prev != null && cnt < k - 1) {
            prev = prev.next;
            cnt++;
        }

        if(prev == null || prev.next == null){
            return head;
        }

        Node nodeToDelete = prev.next;
        prev.next = prev.next.next;

        return head;
    }

    public static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String [] args){
        Node head = new Node(12);
        head.next = new Node(4);
        head.next.next = new Node(9);
        head.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        int k = 2;
        head = findKthDelete(head, k);

        System.out.println("List after deleting node at position " + k + ":");
        printList(head);
    }
}
