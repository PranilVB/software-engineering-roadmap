import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    public static void countSortHash(int[]arr){
        if(arr==null || arr.length<=1){
            return ;
        }
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).max().getAsInt();
        Map<Integer,Integer>countMap=new HashMap<>();
        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0));
        }
        int index=0;
        for (int j = min; j <=max; j++) {
            int count=countMap.getOrDefault(j, 0);
            for (int i = 0; i < count; i++) {
                arr[index]=j;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,5,3,6,8,3,2,3,5,6};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
