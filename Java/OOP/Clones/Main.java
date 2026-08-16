package Clones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Human pranil=new Human(22, "Pranil");
        Human twin=(Human)pranil.clone();
        System.out.println(twin.age);
        pranil.arr[0]=99;
        System.out.println(Arrays.toString(pranil.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}

