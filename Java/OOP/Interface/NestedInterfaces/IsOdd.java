package Interface.NestedInterfaces;

public class IsOdd {
    public interface NestedInterfaces {
    boolean isodd(int n);
        
    }
}
class oddCheck implements IsOdd.NestedInterfaces{

    @Override
    public boolean isodd(int n) {
      return((n&1)==0);
    }

}
