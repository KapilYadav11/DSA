// deleting the middle node of the LL
class Node {

    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node (int data1){
        data = data1;
        next = null;
    }    
}
public class delMidNode {
    public Node findDeleteNode(Node head){
        Node temp = head;
        int n = 0;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        int res = n / 2;
        temp  = head;
        while(temp != null){
            res--;
            if(res == 0){
                Node middlle = temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    };

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
    
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

    
        System.out.print("Original Linked List: ");
        printLL(head);

       delMidNode sol = new delMidNode();
       head = sol.findDeleteNode(head);

        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}