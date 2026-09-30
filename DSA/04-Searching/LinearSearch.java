import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,56,7,8,};
        System.out.println("Enter element to search");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println( true);
            }
        }
    }
}
