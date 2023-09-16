# Sudoku_project

This is a simple Java program that solves Sudoku puzzles using the backtracking algorithm. Sudoku is a popular number puzzle game where the goal is to fill a 9x9 grid with digits so that each column, each row, and each of the nine 3x3 subgrids (called "regions") contains all of the digits from 1 to 9 without repetition.

## How to Use

1. Clone this repository to your local machine using `git clone`.

2. Open the project in your Java IDE.

3. Modify the `grid` array in the `SudokuSolver` class to represent the Sudoku puzzle you want to solve. Use '0' to represent empty cells.

4. Run the program. It will attempt to solve the Sudoku puzzle and print the solution if one exists, or it will print "No solution exists" if the puzzle is unsolvable.

## Algorithm

The Sudoku solver uses a recursive backtracking algorithm to find a solution for the puzzle. Here's how it works:

- It searches for an empty cell in the grid.
- For each empty cell, it tries placing digits from 1 to 9 and checks if it's a valid move.
- If a valid move is found, it recurs to the next empty cell.
- If a solution is found, it returns true.
- If no valid move is found, it backtracks and resets the cell to '0'.
- If it exhaustively checks all possibilities and cannot find a solution, it returns false.

## Code Structure

- `SudokuSolver.java`: Contains the main Sudoku solver code.
- `printGrid()`: Function to print the Sudoku grid.
- `isSafe()`: Function to check if it's safe to place a number in a given cell.
- `solveSudoku()`: Function that implements the backtracking algorithm to solve the puzzle.
- `main()`: Entry point of the program where you can set the initial Sudoku grid.

## Example

Here's an example Sudoku puzzle provided in the `main()` method of the code:

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

css
Copy code

This puzzle will be solved by the program.

Feel free to modify the `grid` array to solve your own Sudoku puzzles.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
Make sure to create a LICENSE file in your repository and choose an appropriate open-source license if you intend to share this code publicly on GitHub.




