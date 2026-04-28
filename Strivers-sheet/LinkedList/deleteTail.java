class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class deleteTail {
    public static Node findDeleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void printList(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String [] args){
        Node head = new Node(12);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);

        System.out.println("Original List");
        printList(head);

        head = findDeleteTail(head);
        System.out.println("List after deleting the tail");
        printList(head);
    }
}
