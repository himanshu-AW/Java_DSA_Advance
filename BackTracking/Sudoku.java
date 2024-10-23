package BackTracking;

public class Sudoku {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check in columns / vertically
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check in rows / horizontally
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Find grid for current row and column (3x3 sub-grid)
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i <startRow + 3; i++) {
            for (int j = startCol; j <startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base case: If we reach beyond the last row (row == 9), the Sudoku is solved
        if (row == 9 && col == 0) {
            return true;
        }

        // Moving to the next cell (right-to-left, top-to-bottom)
        int nextRow = row ;
        int nextCol = col + 1;
        if(col+1 == 9){
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            // System.out.println("Trying to place digit " + digit + " at row " + row + " and column " + col);
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // Place the digit
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // Solution found
                }
                sudoku[row][col] = 0; // Backtrack
            }
        }

        return false; // No solution found, return false to backtrack
    }

    // Function to print a Sudoku grid
    public static void printGrid(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main(String[] args) {
        // Partially completed Sudoku grid
        int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0}, 
         {4, 9, 0, 1, 5, 7, 0, 0, 2}, 
         {0, 0, 3, 0, 0, 4, 1, 9, 0}, 
         {1, 8, 5, 0, 6, 0, 0, 2, 0}, 
         {0, 0, 0, 0, 2, 0, 0, 6, 0}, 
         {9, 6, 0, 4, 0, 5, 3, 0, 0}, 
         {0, 3, 0, 0, 7, 2, 0, 0, 4}, 
         {0, 4, 9, 0, 3, 0, 0, 5, 7}, 
         {8, 2, 7, 0, 0, 9, 0, 1, 3} };

        System.out.println("Partially Completed Grid:");
        printGrid(sudoku);

        sudokuSolver(sudoku, 0, 0);
            System.out.println("\nCompleted Grid:");
            printGrid(sudoku);
        // } else {
        //     System.out.println("\nFailed to solve the Sudoku.");
        // }
    }
}
