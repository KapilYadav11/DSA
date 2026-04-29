import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class removeElement {
    // Added 'int val' as a parameter so the method knows what to look for
    public static Node findRemoveElement(Node head, int val) {
        // Changed ListNode to Node to match your class definition
        Node dummy = new Node(-1);
        dummy.next = head;

        Node current = dummy;
        // Added a check for current.next to avoid NullPointerException
        while (current != null && current.next != null) {
            if (current.next.data == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating the list: 10 -> 5 -> 15 -> 20
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);

        System.out.println("Original List:");
        printList(head);

        int target = 15;
        head = findRemoveElement(head, target);

        System.out.println("List after removing " + target + ":");
        printList(head);
    }
}