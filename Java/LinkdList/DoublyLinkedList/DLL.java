package DoublyLinkedList;

public class DLL {
    Node head;

    public void InsertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        System.out.print("null <-> ");

        Node node = head;
        while (node != null) {
            System.out.print(node.value + " <-> ");
            node = node.next;
        }
        System.out.print(" null");
    }
    public void displayRev() {
        System.out.println();
        Node last=null;
        Node node = head;
        while (node != null) {
            last=node;
            node = node.next;
        }
        System.out.print(" null ");
        while (last!=null) {
            System.out.print(last.value+" <--> ");
            last=last.prev;
        }
        System.out.print("null");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
