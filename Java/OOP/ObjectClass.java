import java.util.Arrays;

public class ObjectClass {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0,8,5,4,23};
        Integer a=2;
        Integer b=2;
        String c="2";
        String d="222";
        Human Pranil=new Human();
        System.out.println("To string "+Arrays.toString(arr));
        System.out.println("Is Equals "+a.equals(b));
        System.out.println("Is Equals "+c.equals(d));
        System.out.println("Hash code "+d.hashCode());
        System.out.println("Class of a: " + a.getClass());
        System.out.println("Class of c: " + c.getClass());
        System.out.println(Pranil.toString());
    }
     
}
class Human{
        String Name;
        int age;
        float weight;
        Human(){
            this. Name="PVB";
            this. age=0;
            this. weight=0f;
        }
            @Override
    public String toString() {
        return "Student[name='" +Name+ 
               "', age=" + age +
               ", Weight="+  weight + "]";
    }
    }