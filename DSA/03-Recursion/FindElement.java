public class FindElement {
    public static void main(String[] args) {
        int[] arr={7,3,534,23,3,4,1,65,4,212,31,31,2,4};
        int target=212;
        System.out.println(FE(arr,target,0));
        }
        static int FE(int[] arr,int target,int i){
            if(i==arr.length){
                return -1;
            }
            if (arr[i]==target) {
                return i;
            }
            else{
            return FE(arr, target, i+1);
            }
        }
}
