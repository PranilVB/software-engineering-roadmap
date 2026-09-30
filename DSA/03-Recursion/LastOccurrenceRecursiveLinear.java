public class LastOccurrenceRecursiveLinear {
    public static void main(String[] args) {
        int[] arr={12, 45, 7, 19, 45, 88, 23, 45, 91, 34, 45, 56, 78, 45, 100};
        int target=45;
        int i=arr.length-1;
        System.out.println("Last Occurance is at : "+LS(arr,target,i));
    }
    static int LS(int[] arr,int target,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return LS(arr, target, i-1);
    }    
}
