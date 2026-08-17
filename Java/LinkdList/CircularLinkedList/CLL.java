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
    public void deleteValue(int value){
        if (head==null) {
            return;
        }
        Node target=head;
        do{
            if(target.next.value==value){
                target.next=target.next.next;
                return;
            }
            target=target.next;
        }
        while(target.next!=head);
        System.out.println("Target not available in List");
        return;
    }
    public void display(){
        Node temp=head;
        do{            
            System.out.print(temp.value+"=>");            
            temp=temp.next;

        }
        while (temp.next!=head);
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
