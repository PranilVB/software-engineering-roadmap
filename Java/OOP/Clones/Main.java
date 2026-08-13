package Clones;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Human pranil=new Human(22, "Pranil");
        Human twin=(Human)pranil.clone();
        System.out.println(twin.age);
    }
}
