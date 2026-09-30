package CustomQueue;

public class MainStack {
    public static void main(String[] args) throws Exception {

    CustomQueue queue = new CustomQueue();

    queue.insert(10);
    queue.insert(20);
    queue.insert(30);
    queue.insert(40);

    System.out.println("Front element: " + queue.front());

    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());

    System.out.println("Front element: " + queue.front());

    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());

    System.out.println("Queue empty: " + queue.isEmpty());
}
}
