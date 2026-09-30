/**
 * MazePath
 */
public class MazePath {

    public static void main(String[] args) {
        Path(3, 3, "");
    }
    static void Path(int r,int c,String p){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            Path(r-1, c, p+" Down");
        }
        if(r>1 && c>1){
            Path(r-1, c-1, p+" Diagonal");
        }
        if(c>1){
            Path(r, c-1, p+" Right");
        }
    }
}