package AccessControl;
public class PrivateExample {

    public static void main(String[] args) {

        Student student = new Student();
        // System.out.println(student.name);   (gives error private class not accessable)
        student.setName("Pranil");
        student.setName("Pranil","Badgujar");
        student.setName("Pranil","Badgujar",11 );

        System.out.println(student.getName());
        System.out.println(student.sirname);
        System.out.println(student.DOB);
    }
   
}

