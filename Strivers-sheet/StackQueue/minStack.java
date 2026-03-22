//Problem Statement: Design a stack that supports the following operations in constant time: push, pop, top, and retrieving the minimum element.


import java.util.Stack;

public class minStack {
    // We use Long to prevent overflow during (2 * val - mini)
    private Stack<Long> st;
    private Long mini;

    public minStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        long val = (long) value;
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else if (val >= mini) {
            st.push(val);
        } else {
            // Encoding formula: 2*val - mini
            st.push(2 * val - mini);
            mini = val;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();

        // If popped value is less than mini, it's a flag
        if (x < mini) {
            // Recovery formula: 2*mini - x
            mini = 2 * mini - x;
        }
        
        // Optional: Reset mini if stack becomes empty
        if (st.isEmpty()) mini = null;
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();
        if (x >= mini) {
            return (int) x;
        } else {
            return (int) (long) mini;
        }
    }

    public int getMin() {
        if (st.isEmpty()) return -1;
        return (int) (long) mini;
    }

    public static void main(String[] args) {
        minStack s = new minStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.print(s.getMin() + " "); // Output: -3
        s.pop();
        System.out.print(s.top() + " ");    // Output: 0
        s.pop();
        System.out.print(s.getMin());       // Output: -2
    }
}



// samajh nhi aaya try karna hai isko baar-baar 