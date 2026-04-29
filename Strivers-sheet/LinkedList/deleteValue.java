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
public class deleteValue {
    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 0; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node findDeleteValue(Node head, int el){
        if(head == null){
            return head;
        }
        if(head.data == el){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if(temp.data == el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
   public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 9, 8, 7};
        Node head = convertArr2LL(arr);
        
        System.out.print("Before: ");
        printList(head);

        head = findDeleteValue(head, 7);

        System.out.print("After: ");
        printList(head); 
    }
}
