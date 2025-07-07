
    package Day_21;

public class NQueen {

    // Check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(char board[][], int row, int col) {
        // Check vertical column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Solve N-Queen problem
    public static boolean nQueen(char board[][], int row) {
        if (row == board.length) {
             printTheBoard(board);
            count++;
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                if(nQueen(board, row + 1)){
                    return true;
                } // Recurse to next row
                board[row][j] = '.'; // Backtrack
            }
        }
        return false;
    }
static int count=0;
    // Print board
    public static void printTheBoard(char arr[][]) {
        System.out.println("___________________________");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if(nQueen(board, 0)){
            System.out.println("Solution is possible");
            printTheBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        System.out.println("Total ways to count="+count);
    }
}

    

