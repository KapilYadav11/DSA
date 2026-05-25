class ListNode {
    int val;
    ListNode next;

    ListNode() {
    };

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    };
}

public class add2Num {
    public ListNode addTwoNum(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }

        return dummy.next;
    }

    public static ListNode creaListNode(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i = 1; i < arr.length; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(ListNode head){
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
         int[] num1 = {2, 4, 3}; // represents 342
        int[] num2 = {5, 6, 4}; // represents 465
        ListNode l1 = creaListNode(num1);
        ListNode l2 = creaListNode(num2);

        add2Num sol = new add2Num();
        ListNode result = sol.addTwoNum(l1, l2);
        printList(result); 
    }
}
