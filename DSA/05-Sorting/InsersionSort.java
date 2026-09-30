import java.util.*;

public class InsersionSort {
    public static void main(String[] args) {
        int[] arr = {
                45, 12, 78, 3, 91,
                56, 24, 67, 89, 10,
                34, 99, 18, 72, 5,
                61, 40, 83, 27, 15
        };
        Insersion(arr);
    }

    static void Insersion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
