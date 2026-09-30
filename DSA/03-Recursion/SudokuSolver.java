class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {

        int r = -1;
        int c = -1;
        boolean emptyLeft = true;

        // Find the first empty cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    r = i;
                    c = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }

        // If no empty cell is left, Sudoku is solved
        if (emptyLeft) {
            return true;
        }

        // Try placing digits 1 to 9
        for (char num = '1'; num <= '9'; num++) {

            if (isSafe(board, r, c, num)) {

                board[r][c] = num;

                if (solve(board)) {
                    return true;
                }

                // Backtrack
                board[r][c] = '.';
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int r, int c, char num) {

        // Check row and column
        for (int i = 0; i < 9; i++) {

            if (board[r][i] == num) {
                return false;
            }

            if (board[i][c] == num) {
                return false;
            }
        }

        // Check the corresponding 3×3 subgrid
        int rowStart = r - r % 3;
        int colStart = c - c % 3;

        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {

                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}