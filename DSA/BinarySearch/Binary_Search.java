import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 9, 68, 632};
        int ans = 2;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ans) {
                System.out.println(ans + " present at index " + mid);
                return;
            }
            if (arr[mid] > ans) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
}