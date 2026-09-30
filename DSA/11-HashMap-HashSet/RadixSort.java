import java.util.Arrays;

public class RadixSort {
    public static  void radix(int[]arr){
        int max=Arrays.stream(arr).max().getAsInt();
        for (int i = 0; max <= i; i*=10) {
            countSort(arr,i);
        }
    }
    private static  void  countSort(int[]arr,int i){
        int[] op=new int[arr.length];
        int[] count =new int[10];
        Arrays.fill(count, 0);
        for (int j = 0; j < arr.length; j++) {
            count[(arr[j]/i)%10]++;
        }
    }
    public static void main(String[] args) {
        
    }
}
