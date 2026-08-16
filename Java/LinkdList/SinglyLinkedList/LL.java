package SinglyLinkedList;
public class LL {
    private int size;
    private Node head;
    private Node tail;
    public LL(){
        this.size=0;
    }
    public void InsertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if (tail==null) {
            tail=head;
        }
        size+=1; 
    }
    public void InsertAtIndex(int index,int value){
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
        Node node =new Node(value,temp.next);
            temp.next=node;
            size ++;
        }
        public Node get(int index){
            Node node =head;
            for (int i = 0; i < index; i++) {
                node=node.next;
            }
            return node;
        }
        public void DeleteLast(){
            if (size<=1) {
                DeleteFirst();
                return;
            }
            Node secondlast=get(size-2);
            tail=secondlast;
            tail.next=null;


        } 
        public void DeleteIndex(int index){
            if (index==0) {
                DeleteFirst();  
            }
            if (index==size-1) {
                DeleteLast();
            }
            Node prev=get(index-1);
            prev.next=prev.next.next;
        }
    public void DeleteFirst(){
        head=head.next;
        if (head==null) {
            tail=null;
        }
        size--;
    }
    // public void DeleteLast()
    public void InsertLast(int value){
        if (tail==null) {
            InsertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1; 
    }
    public void display() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
        
    }
    private class Node{
        private int value;
        private Node next ;
            public Node(int value){
                this.value=value;
            }
            public Node(int value,Node next){
                this.value=value;
                this.next=next;
            }
    }
}
