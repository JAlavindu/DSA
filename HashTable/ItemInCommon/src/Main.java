import java.util.HashMap;

public class Main {

    public static boolean itemInCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> hashTable = new HashMap<>();

        for(int i: arr1){
            hashTable.put(i, true);
        }

        for(int i: arr2){
            if(hashTable.get(i) != null)return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,5};

        System.out.println(itemInCommon(arr1, arr2)); // true
    }
}