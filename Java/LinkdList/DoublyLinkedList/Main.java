package DoublyLinkedList;


public class Main {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.InsertFirst(51);
        list.InsertFirst(23);
        list.InsertFirst(22);
        list.InsertFirst(11);
        list.InsertFirst(54);
        list.InsertFirst(53);
        list.InsertFirst(52);
        list.display();
        list.displayRev();
        list.InsertLast(1000);
        list.display();
    }
}
