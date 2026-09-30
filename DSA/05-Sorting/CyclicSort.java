import java.util.Arrays;

public class CyclicSort {
    
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        Cyclic(arr);    
    }
    static void Cyclic(int[] arr){
        int i=0;
        while (i<arr.length) {
                    int index=i;

            int correct=arr[i]-1;
            if(index+1!=arr[i]){
               int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                 i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

} 