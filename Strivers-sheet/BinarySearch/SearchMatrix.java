public class SearchMatrix {
    public boolean Search2DMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target = 55;
        SearchMatrix sol = new SearchMatrix();
       if(sol.Search2DMatrix(matrix, target)){
        System.out.println("true");
       } else{
        System.out.println("false");
       }
    }
}