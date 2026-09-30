/**
 * CheckSorted
 */
public class CheckSorted {

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,7,8,9,21};
        System.out.println(CS(arr,0));
    }
static boolean CS(int[] arr, int i) {

    if (i == arr.length - 1) {
        return true;
    }

    return arr[i] <= arr[i + 1] && CS(arr, i + 1);
}
}
