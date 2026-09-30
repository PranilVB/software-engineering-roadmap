import java.util.*;
/**
 * bubble_sort
 */
public class bubble_sort {

    public static void main(String[] args) {
        int[] arr={8,7,9,3,5,6,2,4};
                    System.out.println("Unsorted array ="+Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                }
                                
            }
            
        }
            System.out.println("Sorted array ="+Arrays.toString(arr));
        
    }
}
