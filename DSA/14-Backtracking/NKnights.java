public class NKnights {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(KnightWays(board, 0, 0, n*2+2));
    }

    static int KnightWays(boolean[][] board, int r, int c, int knight) {
        int count = 0;
        if (r == board.length) {
            return 0;
        }
        if (knight == 0) {
            display(board);
            return 1;
        }
        if (c == board.length) {
            return KnightWays(board, r + 1, 0, knight);
        }
        if (safe(board, r, c)) {
            board[r][c] = true;
            count += KnightWays(board, r, c + 1, knight - 1);
            board[r][c] = false;
        }

        count+=KnightWays(board, r, c + 1, knight);
        return count;
    }

    private static boolean safe(boolean[][] board, int r, int c) {
        // Top-Left Knight
        if (isValid(board, r - 2, c - 1) && board[r - 2][c - 1]) {
            return false;
        }

        // Top-Right Knight
        if (isValid(board, r - 2, c + 1) && board[r - 2][c + 1]) {
            return false;
        }

        // Left-Top Knight
        if (isValid(board, r - 1, c - 2) && board[r - 1][c - 2]) {
            return false;
        }

        // Right-Top Knight
        if (isValid(board, r - 1, c + 2) && board[r - 1][c + 2]) {
            return false;
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int r, int c) {
        if (r >= 0 && r < board.length && c >= 0 && c < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] r : board) {
            for (boolean element : r) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
