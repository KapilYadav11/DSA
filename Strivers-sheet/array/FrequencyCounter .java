import java.util.*;

class FrequencyCounter {

    // Method to count frequency and find elements with max and min frequency
    public void countFreq(int[] arr, int n) {
        boolean[] visited = new boolean[n]; // To track which elements are already processed
        int maxFreq = 0, minFreq = n;       // Frequency bounds initialization
        int maxEle = 0, minEle = 0;         // Elements with max and min frequency

        for (int i = 0; i < n; i++) {

            // If element already processed, skip
            if (visited[i])
                continue;

            // Count how many times arr[i] occurs
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark as counted
                    count++;
                }
            }

            // Update max frequency and corresponding element
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }

            // Update min frequency and corresponding element
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }

        // Print final results
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public static void main(String[] args) {
        FrequencyCounter fc = new FrequencyCounter();       // Create object of the class
        int[] arr = {10, 5, 10, 15, 10, 5};                  // Sample array
        fc.countFreq(arr, arr.length);                      // Call the function
    }
}
