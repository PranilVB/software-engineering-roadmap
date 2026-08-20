package CustomQueue;

public class MainCircular {
    public static void main(String[] args) throws Exception {
    CircularQueue queue = new CircularQueue(5);
    queue.insert(10);
    queue.insert(20);
    queue.insert(30);
    queue.insert(40);
    queue.insert(50);
    System.out.println("Queue full: " + queue.isFull());
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());
    queue.insert(60);
    queue.insert(70);
    System.out.println("Front element: " + queue.front());
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());
    System.out.println("Removed: " + queue.remove());

    System.out.println("Queue empty: " + queue.isEmpty());
}
}
