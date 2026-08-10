package Polymorphysm;

public class MethodOverloadingEg {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        MethodOverloadingEg Sum=new MethodOverloadingEg();
        System.out.println(Sum.sum(3, 5));
        System.out.println( Sum.sum(3, 5,6));
        System.out.println( Sum.sum(3, 5,6,4));
    }
}
