class DNode {
    int data;
    DNode next;
    DNode back;

    DNode(int data1, DNode next1, DNode back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    DNode(int data1){
        data = data1;
        next = null;
        back = null;
    }
}
public class deleteHead {

public static DNode convArr2LL(int[] arr){
    DNode head = new DNode(arr[0]);
    DNode prev = head;

    for(int i = 1; i < arr.length; i++){
        DNode temp = new DNode(arr[i], null, prev);
        prev.next = temp;
        prev = temp;
    }
    return head;
}

public static DNode deleteheadNode(DNode head){
    if(head == null || head.next == null){
        return null;
    }

    DNode prev = head;
    head = head.next;
    
    head.back = null;
    prev.next = null;

    return head;
}

public static void print(DNode head){
        while (head != null) {
            System.out.println(head.data + " "); 
            head = head.next;
        }
        System.out.println();
    }

    
public static void main(String [] args){
    int[] arr = {12, 5, 8, 9,7};
    DNode head = deleteHead.convArr2LL(arr);
    head = deleteheadNode(head);
    System.out.println("Doubly Linked List after deletion of head is :");
    print(head);

}
}
