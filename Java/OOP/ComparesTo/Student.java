package ComparesTo;
public class Student implements Comparable<Student> {

    int rollno;
    int marks;

    Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }
}