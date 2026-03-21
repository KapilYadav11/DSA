// Problem Statement: Implement a First-In-First-Out (FIFO) queue using two stacks. The implemented queue should support the following operations: push, pop, peek, and isEmpty.

// Implement the StackQueue class:

// void push(int x): Adds element x to the end of the queue.
// int pop(): Removes and returns the front element of the queue.
// int peek(): Returns the front element of the queue without removing it.

import java.util.*;
public class StackkQueue {

    private Stack<Integer> input, output;

    public StackkQueue(){
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x){
        input.push(x);
    }

    public int pop(){
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if(output.isEmpty()){
            System.out.println("Queue is empty, cannot pop");
            return -1;
        }
        return output.pop();
    }

    public int peek(){
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            System.out.println("Queue is empty, cabnnot peek");
            return -1;
        }
        return output.peek();
    }

    public boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        StackkQueue q = new StackkQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element is popped is " + q.pop());
        q.push(5);
        System.out.println("The front of the queue is " + q.peek());
        System.out.println("Is the queue empty? " + (q.isEmpty() ? "Yes" : "No"));
        System.out.println("The element popped is " + q.pop());
        System.out.println("The element popped is " + q.pop());
        System.out.println("Is the queue empty? " + (q.isEmpty() ? "Yes" : "No"));
    }
}
