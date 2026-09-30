import java.util.*;

public class MatrixBinary {
    public static void main(String[] args) {
    
    int[][] mat={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
    int ans = 10;
    int r = 0;
    int c=mat[0].length-1;
    while(r<mat.length && c>=0){
        if(mat[r][c]==ans){
            System.out.println("element present at"+"["+r+"]["+c+"]");
            return ;
        }
        if(mat[r][c]>ans){
            c--;
        }
                else{
            r++;
        }
    }
    System.out.println(ans+" is notpresent in the matrix"); 
}
}
