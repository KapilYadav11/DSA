class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class reverseLL {
   public static ListNode findReverseLL(ListNode head){
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;      
            temp = front;
        }
        return prev;
    }
    

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reverseLL sol = new reverseLL();
        
        ListNode newHead = findReverseLL(head);

        ListNode curr = newHead;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
    }    

}