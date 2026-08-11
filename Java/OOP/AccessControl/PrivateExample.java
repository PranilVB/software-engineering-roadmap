package AccessControl;
public class PrivateExample {

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.name); 
        student.setName("Pranil");

        System.out.println(student.getName());
    }
}

