import java.util.ArrayList;

public class AllOccurrencesRecursive {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 2, 8, 1, 9, 6, 4, 9, 7, 3, 9, 10, 9, 15 };
        int target = 9;
        int i = 0;
        ArrayList<Integer> Occurance = new ArrayList<>();
        System.out.println("First Occurance is at : " + LS(arr, target, i, Occurance));
    }

    static ArrayList<Integer> LS(int[] arr, int target, int i, ArrayList<Integer> Occurance) {
        if (i >= arr.length) {
            if (Occurance.isEmpty()) {
                Occurance.add(-1);
                return Occurance;
            } else {
                return Occurance;
            }
        }
        if (arr[i] == target) {
            Occurance.add(i);
        }
        return LS(arr, target, i + 1,Occurance);
    }
}
