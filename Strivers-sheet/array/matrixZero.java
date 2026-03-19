// // Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix..


// OPTIMAL SOLUTION
public class matrixZero{
    public void setMatrixZero(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowZero){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
        
        if(firstColZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }

    }
    public static void main(String[] args) {
        matrixZero sol = new matrixZero();
        int[][]  matrix = {{1,1,1},{1,0,1},{1,1,1}};

         sol.setMatrixZero(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
}





// THE BETTER SOLUTION
// public class matrixZero {
//     public void setMatrixZero(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         boolean[] row = new boolean[m];
//         boolean[] col = new boolean[n];

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     row[i] = true;
//                     col[j] = true;
//                 }
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (row[i] || col[j]) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         matrixZero sol = new matrixZero();
//         int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

//         sol.setMatrixZero(matrix);

//         for (int[] row : matrix) {
//             for (int val : row) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//         }

//     }
// }

// // BRUTE FORCE SOLUTION
// // public class matrixZero {
// // public void setMatrixZero(int[][] matrix){
// // int m = matrix.length; // row k liye
// // int n = matrix[0].length; //column k liye

// // for(int i = 0; i < m; i++){
// // for(int j = 0; j < n; j++){
// // if(matrix[i][j] == 0){

// // for(int col = 0; col < n; col++){
// // if(matrix[i][col] != 0)
// // matrix[i][col] = -1;
// // }

// // for(int row = 0; row < n; row++){
// // if(matrix[row][j] != 0)
// // matrix[row][j] = -1;
// // }
// // }
// // }
// // }

// // for(int i = 0; i < m; i++){
// // for(int j = 0; j < n; j++){
// // if(matrix[i][j] == -1)
// // matrix[i][j] = 0;
// // }
// // }

// // }

// // public static void main(String [] args){
// // matrixZero sol = new matrixZero();
// // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

// // sol.setMatrixZero(matrix);

// // for (int[] row : matrix) {
// // for (int val : row) {
// // System.out.print(val + " ");
// // }
// // System.out.println();
// // }

// // }
// // }
