package Day_22;

public class sudoku {
    
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
// check the sudo authenticity
        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

             if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                    if (isSafe(board, row, col, num)) {
                            board[row][col] = num;

                        if (solveSudoku(board))
                                return true;

                            board[row][col] = 0; // Backtrack
                        }
                    }

                    return false; // No valid number found
                }
            }
        }
        return true; // Solved
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check row
        for (int x = 0; x < 9; x++)
            if (board[row][x] == num) return false;

        // Check column
        for (int x = 0; x < 9; x++)
            if (board[x][col] == num) return false;

        // Check 3x3 grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if (board[i][j] == num) return false;

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0 && r != 0)
                System.out.println("-----------");
            for (int d = 0; d < 9; d++) {
                if (d % 3 == 0 && d != 0)
                    System.out.print(" | ");
                System.out.print(board[r][d]+" ");
            }
            System.out.println();
        }
    }
}