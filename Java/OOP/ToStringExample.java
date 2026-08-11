public class ToStringExample {

    public static void main(String[] args) {

        Student student = new Student("Pranil", 21, 99.5f);


        System.out.println("Override "+student.toString());
    }
}

class Student {

    String name;
    int age;
    float marks;

    Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student[name='" + name +
               "', age=" + age +
               ", marks=" + marks + "]";
    }
}