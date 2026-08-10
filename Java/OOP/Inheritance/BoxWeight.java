package Inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        super(0);
        this.weight=0;
    }
    public BoxWeight(double l, double b, double h,double weight) {
        super(l, b, h);
        this.weight=weight;
    }
    
}
