import java.util.*;
public class MaxInsertion {
    static int[] heap = new int[10];
    static int size = 0;
    public static void insert(int val){
        int cuurentIdx = size;
        heap[cuurentIdx] = val;
        size++;

        while (cuurentIdx > 0) {
           int parentIdx = (cuurentIdx - 1) / 2;
           
           if (heap[cuurentIdx] > heap[parentIdx]) {
            int temp  = heap[cuurentIdx];
            heap[cuurentIdx] = heap[parentIdx];
            heap[parentIdx] = temp;

            cuurentIdx = parentIdx;
           } else{
            break;
           }
        }
    }

    public static int removeRoot(){
        if(size == 0){
            System.out.println("Heap is empty");
            return -1;
        }
        int rootValue = heap[0];
        heap[0] = heap[size - 1];
        size--;

        int currentIndex = 0;
        while (true) {
            int leftChild = 2 * currentIndex + 1;
            int rightChild = 2 * currentIndex + 2;

            int largestIndex = currentIndex;

            if(leftChild < size && heap[leftChild] > heap[largestIndex]){
                largestIndex = leftChild;
            }

            if(rightChild < size && heap[rightChild] > heap[largestIndex]){
                largestIndex = rightChild;
            }

            if(largestIndex == currentIndex){
                break;
            }

            int temp = heap[currentIndex];
            heap[currentIndex] = heap[largestIndex];
            heap[largestIndex] = temp;

            currentIndex = largestIndex;
        }
        return rootValue;
    }

    public static void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert(30);
        insert(20);
        insert(15);
        insert(10);

        System.out.print("Heap before inserting 40: ");
        printHeap(); 

        insert(40);

        System.out.print("Heap after inserting 40:  ");
        printHeap();

        System.out.println();
        System.out.println();

        System.out.print("Before Deletion heap: ");
        printHeap(); 
       
        
        int deletedElement = removeRoot();
        System.out.println("Deleted Element (Root): " + deletedElement); // Output: 40

        System.out.print("After Deletion heap:  ");
        printHeap(); 

    }
}