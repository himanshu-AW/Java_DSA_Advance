package BackTracking;

public class NQueen2 {
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

    public static void nQueen(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }
        // kaam
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1);
                board[row][j] = '-';
            }
        }
    }

    private static int count = 0;
    public int printNqeen(int n){
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        nQueen(board, 0);
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        // number of queens must be greater than 3. otherwise there is not ways to show
        // it.
        
        NQueen2 obj = new NQueen2();
        int ans = obj.printNqeen(n);
        System.out.println("Number of possible  ways: " +ans );
    }
}
