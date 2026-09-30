import java.util.Stack;

public class StackEg1Prebuilt {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        
        for (int j = 0; j < 10; j++) {
            stack.push(j);
        } 

        for (int i = 0; i < 10; i++) {
            System.out.println( stack.pop());
        }

    }
}
