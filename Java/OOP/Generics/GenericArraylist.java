
public class GenericArraylist<T> {

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public GenericArraylist(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add (T num){
        if(this.IsFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean IsFull() {
       return size==data.length;
    }    
        public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T set ){
        data[index]=set;
        return;
    }
    public static void main(String[] args) {
        GenericArraylist<Integer> l=new GenericArraylist<>();
        GenericArraylist<String> names = new GenericArraylist<>();
names.add("Pranil");
names.add("Koustubh");
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        System.out.println(l.get(2));
        System.out.println(l.remove());
        System.out.println(l.size);
        System.out.println(names.get(0));
    }
}
