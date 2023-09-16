public class SudokuSolver {

    static int N = 9; // Size of the Sudoku grid

    // Function to print the Sudoku grid
    static void printGrid(int[][] grid) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Function to check if it's safe to place a number in a given cell
    static boolean isSafe(int[][] grid, int row, int col, int num) {
        // Check if the number is already present in the current row or column
        for (int x = 0; x < N; x++) {
            if (grid[row][x] == num || grid[x][col] == num) {
                return false;
            }
        }

        // Check if the number is already present in the current 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true; // If no conflicts, it's safe to place the number
    }

    // Function to solve the Sudoku puzzle using backtracking
    static boolean solveSudoku(int[][] grid) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                // If the cell is empty, try placing numbers from 1 to 9
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(grid, row, col, num)) {
                            // If it's safe, assign the number
                            grid[row][col] = num;

                            // Recursively solve the rest of the puzzle
                            if (solveSudoku(grid)) {
                                return true;
                            }

                            // If not, backtrack by resetting the cell to 0
                            grid[row][col] = 0;
                        }
                    }
                    return false; // If no valid number can be placed, trigger backtracking
                }
            }
        }
        return true; // The puzzle is solved if all cells are filled
    }

    public static void main(String[] args) {
        int[][] grid = {
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

        if (solveSudoku(grid)) {
            System.out.println("Sudoku solution:");
            printGrid(grid);
        } else {
            System.out.println("No solution exists");
        }
    }
}
