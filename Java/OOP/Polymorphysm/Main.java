package Polymorphysm;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle cir=new Circle();
        Rectangle rec=new Rectangle();
        Triangle tri=new Triangle();
        shape.area();
        rec.area();
        tri.area();
        cir.area();
    }
}
