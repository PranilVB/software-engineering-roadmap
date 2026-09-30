import java.util.*;

/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 9, 5, 7, 4, 3, 6, 8, 0, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[max] <= arr[j]) {
                    max = j;
                }

                int temp = arr[max];
                arr[max] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}