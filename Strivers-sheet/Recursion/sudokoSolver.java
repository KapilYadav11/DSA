import java.util.*;
public class sudokoSolver {
    public boolean isValid(char[][] board, int row, int col, char c){

        // current col check kr rahe hai duplicate k liye
        for(int i = 0; i < 9; i++){
            if(board[i][col] == c){
                return false;
            }
        }

        // current row ko check kr rahe hai duplicate ke liye 
        for(int i = 0; i < 9; i++){
            if(board[row][i] == c){
                return false;
            }
        }

        // start of 3x3 grid find kr rahe hai
        int boxRowStart = 3 * (row / 3);
        int boxColStart = 3 * (col / 3);
        // 3x3 ke grid ko duplicate k liye check kr rahe
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[boxRowStart + i][boxColStart + j] == c){
                    return false;
                }
            }
        }

        // placement of value is valid
        return true;
    }

    public boolean solveSudoko(char[][] board){
        // har ek cell pr ja rahe hai
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){

                //agar board ka cell empty hai toh
                if(board[i][j] == '.'){

                    // har ek digit try kr rahe hai
                    for(char c = '1'; c <= '9'; c++){

                        // checking is placing a c is valid
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; // placing a c

                            // recurse to rest
                            if(solveSudoko(board)){
                                return true;
                            }

                            board[i][j] = '.'; // backtrack if needed
                        }
                    }
                    return false; // agar koi number fit na ho, toh backtrack karo
                }
            }
        }
        return true; // all cells correctly filled  ho gyi ho
    }

    public static void main(String[] args) {
        char[][] board = {
            {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
            {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
            {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
            {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
            {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
            {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
            {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
            {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
            {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };

        sudokoSolver sol = new sudokoSolver();
        
        if (sol.solveSudoko(board)) {
            System.out.println("--- SOLVED SUDOKU ---");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists for this Sudoku.");
        }
    }
}
