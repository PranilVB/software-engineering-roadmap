package SinglyLinkedList;
public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.InsertFirst(51);
        list.InsertFirst(23);
        list.InsertFirst(22);
        list.InsertFirst(11);
        list.InsertFirst(54);
        list.InsertFirst(53);
        list.InsertFirst(52);
        list.InsertLast(23);
        list.InsertLast(22);
        list.InsertLast(11);
        list.InsertLast(54);
        list.InsertLast(53);
        list.InsertLast(52);
        list.InsertAtIndex(3, 100);
        System.out.println("Before Deleting ");
        list.display();
        System.out.println("After Deleting First "); 
        list.DeleteFirst();
        list.display();
        System.out.println("After deleting last element ");
        list.DeleteLast();
        list.display();
        list.DeleteIndex(3);
        System.out.println("Index element removed \n new list is :");
        list.display();
    }
}
