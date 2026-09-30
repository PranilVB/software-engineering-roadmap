public class Fibonacci {
    public static void main(String[] args) {
       int n=4;
        System.out.println(FindFibonacci(n));;
    }  
    static int FindFibonacci(int n){
        if(n<2){
            return n;
        }
        return FindFibonacci(n-1)+FindFibonacci(n-2);
    }  
}
