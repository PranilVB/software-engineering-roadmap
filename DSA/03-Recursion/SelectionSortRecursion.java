import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 5, 4, 6, 3, 2, 33, 5};
        int max=0;
        SSR(arr, arr.length - 1, 0,max);

        System.out.println(Arrays.toString(arr));

    }
    static int[] SSR(int[] arr, int l, int n,int max) {

        if(l==0){
            return arr;
        }
if(n<=l){
            if(arr[n]>arr[max]){
            max=n;
            return SSR(arr, l, n+1, max);
        }
        else{
        return SSR(arr, l, n+1, max);
        }
}
else{
    
        int temp=arr[l];
        arr[l]=arr[max];
        arr[max]=temp;
        return SSR(arr, l-1, n=0, max=0);
}


    }
}
