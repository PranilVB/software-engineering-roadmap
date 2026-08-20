package CustomStack;

public class MainStack {
    public static void main(String[] args) throws Exception{
        DynamicStack stack=new DynamicStack(7);
        stack.push(12);
        stack.push(11);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        System.out.println("Peek element is : "+stack.peek());
        System.out.println("Peek element is : "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
