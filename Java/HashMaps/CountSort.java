import java.util.Arrays;

public class CountSort {
    public static  void countSort(int[] arr){
        if(arr==null || arr.length<=1){
            return ;
        }
        int max=arr[0];
        for (int i : arr) {
            if (i>max) {
                max=i;
            }
        }
        int[] freq=new int[max+1];
        for (int i : arr) {
            freq[i]++;
        }
        int index=0;
        for (int i = 0; i <= max; i++) {
            while (freq[i]!=0) {
                arr[index]=i;
                index++;
                freq[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,5,3,6,8,3,2,3,5,6};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
