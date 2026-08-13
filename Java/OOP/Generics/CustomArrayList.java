
public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add (int num){
        if(this.IsFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean IsFull() {
       return size==data.length;
    }    
        public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int set ){
        data[index]=set;
        return;
    }
    public static void main(String[] args) {
        CustomArrayList l=new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        System.out.println(l.get(2));
        System.out.println(l.remove());
        System.out.println(l.size);
    }
}
