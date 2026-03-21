// Problem Statement: Implement a Last-In-First-Out (LIFO) stack using a single queue. The implemented stack should support the following operations: push, pop, top, and isEmpty.

// Implement the QueueStack class:

// push(int x): Pushes element x onto the stack.
// pop(): Removes and returns the top element of the stack.
// top(): Returns the top element of the stack without removing it.
// isEmpty(): Returns true if the stack is empty, false otherwise.


import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    Queue<Integer> q = new LinkedList<>();


    public void push(int x){
        int s = q.size();
        q.add(x);

        for(int i = 0; i < s; i++){
            q.add(q.poll()); // poll():: remove + return karega 
        }
    }

    public int pop(){
        int n = q.peek(); //peek() ::: aage wale element ko dekhne k liye 
        q.poll();
        return n;
    }

    public int top(){
        return q.peek();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
    
    public static void main(String [] args){
       QueueStack st = new QueueStack();
       String[] commands = {"QueueStack", "push", "push", "pop", "top", "isEmpty"};
       int[][] input = {{}, {4}, {8}, {}, {}, {}}; 
       
       for(int i = 0; i < commands.length; i++){
        switch (commands[i]) {
            case "push":
                st.push(input[i][0]);
                System.out.print("null ");
                break;

            case "pop":
                System.out.print(st.pop() + " ");
                break;
            
            case "top":
                System.out.print(st.top() + " ");
                break;
                
            case "isEmpty":
                System.out.print(st.isEmpty() ? "true " : "false");
                break;
                
            case "QueueStack":
                System.out.print("null ");
                break;    
        }
       }
    }

}
