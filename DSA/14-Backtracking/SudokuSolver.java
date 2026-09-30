public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
    {5,3,0,0,7,0,0,0,0},
    {6,0,0,1,9,5,0,0,0},
    {0,9,8,0,0,0,0,6,0},
    {8,0,0,0,6,0,0,0,3},
    {4,0,0,8,0,3,0,0,1},
    {7,0,0,0,2,0,0,0,6},
    {0,6,0,0,0,0,2,8,0},
    {0,0,0,4,1,9,0,0,5},
    {0,0,0,0,8,0,0,7,9}
};
if (Solution(board)) {
    display(board);
}
else{
    System.out.println("Invalid board");
}

    }

    static boolean Solution(int[][]board){
        int n =board.length;
        int r=-1;
        int c=-2;
        boolean emptyLeft=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    r=i;
                    c=j;
                    emptyLeft=false;
                    break;
                }
            }
            if (emptyLeft==false) {
                break;
            }
            
        }
        if (emptyLeft==true) {
            return true;
        }
        for (int i = 1; i < 10; i++) {
            if(IsSafe(board, r, c,i)){
                board[r][c]=i;
                if(Solution(board)){
                    return true;
                }
                else{
                    board[r][c]=0;
                }
            }
        }
        return false;
    }
    private static void display(int [][]board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            
        }
    }
    static boolean IsSafe(int[][] board, int r, int c, int nums) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == nums) {
                return false;
            }
            if (board[r][i] == nums) {
                return false;
            }
        }
            int sqrt = (int) (Math.sqrt(board.length));
            int rs = r - r % sqrt;
            int cs = c - c % sqrt;
            for (int j = rs; j < rs + sqrt; j++) {
                for (int k = cs; k < cs + sqrt; k++) {
                    if (nums == board[j][k]) {
                        return false;
                    }
                }
            }
                    
        return true;

    }
}
