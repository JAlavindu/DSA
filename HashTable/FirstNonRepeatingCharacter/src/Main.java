import java.util.*;


public class Main {

    public static Character firstNonRepeatingChar(String str){
       char[] charArray=  str.toCharArray();
       HashMap <Character, Boolean> hashTable = new HashMap<>();

        for (char c : charArray) {
            if (hashTable.get(c) == null) {
                hashTable.put(c, true);
            } else {
                hashTable.remove(c);
            }
        }

       for(char c : charArray){
            if(hashTable.get(c) != null){
                return c;
            }
        }
        return null;

    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

}
