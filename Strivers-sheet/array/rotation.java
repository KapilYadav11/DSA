// // Problem Statement: Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise. The rotation must be done in place, meaning the input 2D matrix must be modified directly..

public class rotation {
    public void rotateClockWise(int[][] matrix){
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }

    public static void main(String [] args){
        rotation sol = new rotation();
        int[][] matrix = {
             {1, 2, 3},
             {4, 5, 6},
             {7, 8, 9}
         };

         sol.rotateClockWise(matrix);
         for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            System.out.println();    
            }
         }
    }
}

// BRUTE FORCE APPROACH
// public class rotation {
//     public int[][] rotateClockWise(int [][] matrix){
//         int n = matrix.length;
//         int[][] rotated = new int[n][n];

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 rotated[j][n-i-1] = matrix[i][j];
//             }
//         }

//         return rotated;
//     }

//     public static void main(String [] args){
//         rotation sol = new rotation();
//         int [][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
//         int[][] rotated = sol.rotateClockWise(matrix);

//         for (int[] row : rotated) {
//             for (int val : row) {
//                 System.out.print(val + " ");
//                   System.out.println();
//             }
//         }
//     }
// }
