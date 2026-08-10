package Inheritance;

public class BoxCost extends BoxWeight {
    double Cost;
    BoxCost(){
        super();
        this.Cost=0;
    }
    public BoxCost(double l, double b, double h,double weight,double Cost){
        super(l, b, h, weight);
        this.Cost=Cost;
    }
}
