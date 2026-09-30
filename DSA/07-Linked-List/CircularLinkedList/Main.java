package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL C=new CLL();
        C.InsertValue(1);
        C.InsertValue(21);
        C.InsertValue(13);
        C.InsertValue(41);
        C.InsertValue(15);
        C.InsertValue(16);
        C.InsertValue(17);
        C.InsertValue(18);
        C.InsertValue(394);
        C.InsertValue(2);
        C.display();
        System.out.println("target to delete 17");
        C.deleteValue(17);
        C.display();
        System.out.println("target to delete head");
        C.deleteValue(1);
        C.display();
        System.out.println("target to delete tail");
        C.deleteValue(2);
        C.display();
    }
}
