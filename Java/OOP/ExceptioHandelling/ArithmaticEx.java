public class ArithmaticEx {
public static void main(String[] args) {
    int a=0;
    int b=3;
    try{
        devide(a, b);
    }catch(ArithmeticException e){System.out.println(e);}
    finally{
        System.out.println("This will always run");
    }
}    
static int devide(int a ,int b){
    if (a==0) {
        throw new ArithmeticException();
    }
    return b/a;
}
}
