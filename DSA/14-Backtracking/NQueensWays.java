public class NQueensWays {
    public static void main(String[] args) {
        int n=1;
        boolean[][] board = new boolean[n][n];
        int r = 0;
        System.out.println(QueenWays(board, r));
    }

    static int QueenWays(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int c = 0; c < board.length; c++) {
            if (safe(board, r, c)) {
                board[r][c] = true;
                count += QueenWays(board, r + 1);
                board[r][c] = false;
            }
        }
        return count;
    }

    private static boolean safe(boolean[][] board, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
            int maxLeft = Math.min(r, c);
            for (int d = 1; d <= maxLeft; d++) {
                if (board[r - d][c - d]) {
                    return false;
                }
            }
            int maxRight = Math.min(r, board.length - c - 1);
            for (int g = 1; g <= maxRight; g++) {
                if (board[r - g][c + g]) {
                    return false;
                }
            }

        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] r : board) {
            for (boolean element : r) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
