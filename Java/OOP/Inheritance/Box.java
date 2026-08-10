package Inheritance;

public class Box {
    double h=0;
    double l=0;
    double b=0;
    Box(double h){
        this.b=h;
        this.l=h;
        this.h=h;
    }
    Box(double l,double h){
        this.b=l;
        this.l=l;
        this.h=h;
    }
    Box(double l,double b,double h){
        this.b=b;
        this.l=l;
        this.h=h;
    }
    public static void info() {
        System.out.println("this is box class");
    }
}
