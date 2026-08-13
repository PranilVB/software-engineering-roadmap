package Clones;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{1,2,3,5,6,7,75,3,1,1312};
    }

        // public Object clone()throws CloneNotSupportedException{
        //     return super.clone();

        // }
        public Object clone()throws CloneNotSupportedException{
            Human twin= (Human)super.clone();
            twin.arr=new int[twin.arr.length];
            for (int i = 0; i < twin.arr.length; i++) {
                twin.arr[i]=this.arr[i];
            }
return twin;
        }
}
