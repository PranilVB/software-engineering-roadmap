package CircularLinkedList;
public class CLL {
    private Node head;
    private Node tail;
    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void InsertValue(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void deleteValue(int value) {
        if (head == null) {
            return;
        }
        if (head == tail) {
            if (head.value == value) {
                head = null;
                tail = null;
            }
            return;
        }
        Node target = head;
        do {
            if (head.value == value) {
                head = head.next;
                tail.next = head;
                return;
            }
            if (target.next.value == value) {
                if (target.next == tail) {
                    tail = target;
                }
                target.next = target.next.next;
                tail.next = head;
                return;
            }
            target = target.next;
        } while (target != tail);
        System.out.println("Target not available in List");
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + "=>");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }
    private class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}