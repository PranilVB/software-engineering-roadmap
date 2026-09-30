public class Backtracking {
    public static void main(String[] args) {
        System.out.println(Maze(3,3));
    }
    static int Maze(int r,int c){
        if(r==0 || c==0){
            return 1;
        }
        int l=Maze(r-1, c);
        int ri=Maze(r, c-1);
        return l+ri;
    }
}
