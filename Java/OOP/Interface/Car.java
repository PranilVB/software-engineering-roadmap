package Interface;

public class Car implements Engine,Media,Brake {
    
    @Override
    public void Brake() {
        System.out.println("this is brake ");
    }

    @Override
    public void Stop() {
        System.out.println("this is Stop");
    }

    @Override
    public void Start() {
        System.out.println("this is Start");
    }

    @Override
    public void Acclerate() {
        System.out.println("this is Acclerate");
    }
    
}
