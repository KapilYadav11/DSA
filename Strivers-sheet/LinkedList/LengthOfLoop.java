class Node{
    int data;
    Node next;

Node (int data1, Node next1){
    data = data1;
    next = next1;
}

Node(int data1){
    data = data1;
    next = null;
}
}
public class LengthOfLoop {
    public int findLengthOfLoopLL(Node head){
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return countLoopLength(slow);
            }
        }

        return 0;
    }

    public int countLoopLength(Node meetingPoint){
        Node temp = meetingPoint;
        int length = 1;

        while(temp.next != meetingPoint){
            temp = temp.next;
            length++;
        }

        return length;
    }

    public static void main(String [] args){
        Node head = new Node(1);
        Node second = new Node (2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next =  third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;

        LengthOfLoop sol = new LengthOfLoop();

        int loopLength = sol.findLengthOfLoopLL(head);

        if(loopLength > 0){
            System.out.println("Length of the loop : " + loopLength);
        } else{
            System.out.println("We do not find the  loop");
        }
    }
}