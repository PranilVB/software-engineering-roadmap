public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr={8,6,7,4,79,67,45,34,645,67,77,88};
        int target=67;
        int i=0;
        System.out.println(LS(arr,target,i));
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
