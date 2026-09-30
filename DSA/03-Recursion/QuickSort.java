import java.util.Arrays;

/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[]arr={75,453,2,43,556,64,4,46,1232,3245};
        QS(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QS(int[] arr,int l,int r){
        if(l>=r){
            return;
        }        
        int s=l;
        int e=r;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while (s<=e) {
            while (arr[s]<pivot) {
                s++;
            }
            while (arr[e]>pivot) {
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        QS(arr, l, e);
        QS(arr, s, r);
    }
}

