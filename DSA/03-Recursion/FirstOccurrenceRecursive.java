public class FirstOccurrenceRecursive {
    public static void main(String[] args) {
        int[] arr={5, 9, 2, 8, 1, 9, 6, 4, 9, 7, 3, 9, 10, 9, 15};
        int target=9;
        int i=0;
        System.out.println("First Occurance is at : "+LS(arr,target,i));
    }
    static int LS(int[] arr,int target,int i){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return LS(arr, target, i+1);
    }    
}
