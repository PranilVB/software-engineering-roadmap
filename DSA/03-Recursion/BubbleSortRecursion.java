import java.util.Arrays;

public class BubbleSortRecursion {

    public static void main(String[] args) {

        int[] arr = {9, 7, 8, 5, 4, 6, 3, 2, 33, 5};

        BSR(arr, arr.length - 1, 0);

        System.out.println(Arrays.toString(arr));
    }

    static int[] BSR(int[] arr, int l, int n) {

        if (l == 0) {
            return arr;
        }

        if (n == l) {
            return BSR(arr, l - 1, 0);
        }

        if (arr[n] > arr[n + 1]) {
            int temp = arr[n];
            arr[n] = arr[n + 1];
            arr[n + 1] = temp;
        }

        return BSR(arr, l, n + 1);
    }
}