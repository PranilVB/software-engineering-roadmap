import java.util.*;
public class BinarySearchDecending {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int[] arr={99,98,97,96,56,54,43,23,21,12,11,10,2,1,0,-1};
        int ans=sc.nextInt();
        int start=0;
        
        int end=arr.length-1;
        while(start<=end){
            int mid=start-(start-end)/2;

            if(arr[mid]==ans){
                System.out.println(ans+"is present at index of :"+mid);
                return;
            }
            if(arr[mid]<ans){
                end=mid-1;
                
            }
            else{
                start=mid+1;
            }

        }
        System.out.println("element not found");
    }
    
}
