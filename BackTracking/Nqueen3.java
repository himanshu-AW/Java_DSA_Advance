package BackTracking;

public class Nqueen3 {
    private static boolean isSafe(char[][] board, int row, int col) {
        // check for vertical up side
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // check for left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // check for right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueen(char[][] board, int row) {
        if (row == board.length) {
            return true;
        }
        // kaam
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueen(board, row + 1)){
                    return true;
                }
                board[row][j] = '-';
            }
        }
        return false;
    }

    public static void printBorad(char[][] board) {
        System.out.println("----------------------- New Board --------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // find 1st solution if exits
        int n = 4;
        // number of queens must be greater than 3. otherwise there is not ways to show it.
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        if(nQueen(board, 0)){
            printBorad(board);
        }else{
            System.out.println("there is no solution");
        }

    }
}
