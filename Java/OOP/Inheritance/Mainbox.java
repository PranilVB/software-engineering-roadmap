package Inheritance;

public class Mainbox {
    public static void main(String[] args) {
        // Box Cube=new Box(5);
        BoxWeight Cube=new BoxWeight();
        BoxCost cuboid=new BoxCost(5, 7, 6, 76, 666.66);
        System.out.println(cuboid.Cost);
        // System.out.println("BOx Weight is :"+Cube.weight);
    }
}
