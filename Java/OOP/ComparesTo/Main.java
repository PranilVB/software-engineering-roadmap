package ComparesTo;

public class Main  {
    public static void main(String[] args) {
        Student Pranil=new Student(2, 99);
        Student Koustubh=new Student(3, 92);
        if(Pranil.compareTo(Koustubh)>0){
            System.out.println("Pranil has more marks ");
        }
        else if(Pranil.compareTo(Koustubh)==0){
            System.out.println("Both have same marks ");
        }
        else{
            System.out.println("Koustubh has more marks");
        }
    }
}
