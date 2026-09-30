public class MazeObstical {
    public static void main(String[] args) {
        Obstical(4, 4, 2, 2, "");
    }

    static void Obstical(int r,int c,int rockrow,int rockcolumn,String p){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1 ){
            Obstical(r-1,c-1,rockrow,rockcolumn,p+"--Diagonal");
        }
        
        if(r>1  ){
            Obstical(r-1,c,rockrow,rockcolumn,p+"--Right");
        }
        
        if( c>1 ){
            Obstical(r,c-1,rockrow,rockcolumn,p+"--Down");
        }
if (r == rockrow && c == rockcolumn) {
    return;
}
    }
}
