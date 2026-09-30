import java.util.*;
public class PivotFinder {
    public static void main(String[] args) {
        
    int[] nums={8,9,0,1,2,3,4,5,6,7};
    int start=0;
    int end=nums.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        
        if(nums[start]<nums[mid]){
            start=mid+1;
        }
        if (nums[mid]<nums[end]) {
            end=mid-1;            
        }
    }
    System.out.println("Pivot present at "+(start-1));
}
}
