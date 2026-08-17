package CircularLinkedList;

public class CLL {
    private Node head;
    private Node tail;
    public CLL() {
        this.head = null;
        this.tail = null;
    }
        public void InsertValue(int value){
            Node node=new Node(value);
            if (head==null) {
                head=node;
                tail=node;
                return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display(){
        Node temp=head;
        while (temp.next!=head) {
            System.out.print(temp.value+"<=>");
            temp=temp.next;
        }
        System.out.print(head.value);
    }
    private class Node{
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
