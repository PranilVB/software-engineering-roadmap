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
        public Node get(int index){
            Node node =head;
            for (int i = 0; i < index; i++) {
                node=node.next;
            }
            return node;
        }
    public void InsertLast(int value){
        if (head==null) {
            InsertFirst(value);
            return;
        }
        Node node=new Node(value);
        node.next=null;
        Node last=head;
        while (last.next!=null) {
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        
    }
public void InsertAfter(int nvalue, int value) {
    Node indexFinder = head;

    while (indexFinder != null && indexFinder.value != nvalue) {
        indexFinder = indexFinder.next;
    }

    if (indexFinder == null) {
        System.out.println("Value not found");
        return;
    }

    if (indexFinder.next == null) {
        InsertLast(value);
        return;
    }

    Node node = new Node(value, indexFinder.next, indexFinder);

    indexFinder.next.prev = node;
    indexFinder.next = node;
}
    public void InsertIndex(int index,int value){
         Node last=head;
         int size=0;
        while (last!=null) {
            last=last.next;
            size++;
        }
        if (index==0) {
             InsertFirst(value);  
             return;       
        }
        if (index==size) {
            InsertLast(value);
            return;         
        }
                Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node =new Node(value,temp.next,temp);
        temp.next.prev=node;
        temp.next=node;

        }
    
    public void display() {
        System.out.print("\n null <-> ");

        Node node = head;
        while (node != null) {
            System.out.print(node.value + " <-> ");
            node = node.next;
        }
        System.out.print(" null");
    }

    public void displayRev() {
        System.out.println();
        Node last = null;
        Node node = head;
        while (node != null) {
            last = node;
            node = node.next;
        }
        System.out.println("Printed in reverse");

        System.out.print(" null ");
        while (last != null) {
            System.out.print(last.value + " <--> ");
            last = last.prev;
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
