class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        data = data1;
        next = null;
        back = null;
    }
}

public class arr2LL {
    public static Node converArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 0; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp; 
        }
        return head;
    }

    public static void print(Node head){
        while (head != null) {
            System.out.println(head.data + " "); 
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr = {12, 5, 8, 7, 4};
        Node head = arr2LL.converArr2LL(arr);

        System.out.println("Doubly Linked List Initially is :");
        print(head);


    }
}
