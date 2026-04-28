// DELETION OF THE HEAD FROM THE LINKED LIST
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
public class delete {
    public static Node deleteNode(Node head){
        if(head == null){
            return head ;
        }
        head = head.next;
        return head;
    }

    public static void main(String [] args){
        Node head = new Node(12);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(4);
        head = deleteNode(head);

        if(head != null){
            System.out.println("New Head after the deletion is " + head.data);
        } else {
            System.out.println("The list is now empty");
        }
        
    }
}
