import java.util.*;

public class Main {

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        List<int[]> pairArray = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // Add elements of arr1 to set for fast lookup
        for (int num : arr1) {
            set.add(num);
        }

        // Now, for each number in arr1, check if (target - num) exists in arr2
        for (int num : arr2) {
            int complement = target - num;
            if (set.contains(complement)) {
                pairArray.add(new int[]{num, complement});
            }
        }

        return pairArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 6]
            [3, 4]
            [5, 2]
        */
    }
}
