public class LargestRectangle {

      public static int largestArea(int[] arr, int n) {
        int maxArea = 0;

        // Loop through all possible start indices
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;

            // Loop through all possible end indices
            for (int j = i; j < n; j++) {
                // Update minimum height in current range
                minHeight = Math.min(minHeight, arr[j]);

                // Calculate area of current rectangle
                int area = minHeight * (j - i + 1);

                // Update maxArea
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3, 1};
        int n = arr.length;

        System.out.println("The largest area in the histogram is " + largestArea(arr, n));
    }
}

// NOT UNDERSTOOD MUCH , TRY AGAIN TO KNOW ABOUT IT MORE 