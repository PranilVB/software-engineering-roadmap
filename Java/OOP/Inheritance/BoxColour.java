package Inheritance;

public class BoxColour extends BoxWeight{
    String Clour;
    BoxColour(){
        this.Clour="NA";
    }
    public BoxColour(double Weight,String Colour) {
    super(Weight);
    this.Clour=Colour;
    }
}
