package AccessControlTest;

import AccessControl.Student;

public class ProtectedChild extends Student {

    public void testProtected() {


        DOB = 11;

        System.out.println("DOB: " + DOB);
    }

    public static void main(String[] args) {

        ProtectedChild child = new ProtectedChild();

        child.testProtected();
    }
}