public class ArithmaticEx {
public static void main(String[] args) {
    int a=0;
    int b=3;
    try{
        int c=b/a;
    }catch(ArithmeticException e){System.out.println(e);}
}    
}
