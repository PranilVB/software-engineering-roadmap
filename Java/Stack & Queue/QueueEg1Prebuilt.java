
import java.util.LinkedList;
import java.util.Queue;


public class QueueEg1Prebuilt {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(9);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(4);
        queue.add(55);
        queue.add(92);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
