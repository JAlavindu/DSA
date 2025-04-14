import java.util.*;


public class Main {

    public static List<Integer> findDuplicates(int[] nums){
        HashMap<Integer, Boolean> hashTable = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int i : nums){
            if(hashTable.containsKey(i)){
                duplicates.add(i);
            }else{
                hashTable.put(i, false);
            }
        }

        return duplicates;

    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}
