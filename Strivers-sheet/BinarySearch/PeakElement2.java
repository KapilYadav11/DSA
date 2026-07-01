public class PeakElement2 {
    public int maxElement(int[][] mat, int col) {
        int n = mat.length;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = maxElement(mat, mid);

            int left = mid - 1 >= 0 ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = mid + 1 < m ? mat[row][mid + 1] : Integer.MIN_VALUE;

            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[] { row, mid };
            } else if (left > mat[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        PeakElement2 sol = new PeakElement2();
        int[][] mat = {
                { 4, 2, 5, 1, 4, 5 },
                { 2, 9, 3, 2, 3, 2 },
                { 1, 7, 6, 0, 1, 3 },
                { 3, 6, 2, 3, 7, 2 }
        };
        int[] peak = sol.findPeakGrid(mat);

        System.out.println("The row of the peak element is " + peak[0] +
                " and the column of the peak element is " + peak[1]);
    }
}