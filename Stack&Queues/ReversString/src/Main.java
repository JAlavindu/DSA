public class Main {

    public static String reverseString(String str){

//        StringBuilder reversed = new StringBuilder();
//        for(int i = str.length()-1; i >= 0; i--){
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();

//        Stack newString = new Stack();
//        for (int i = str.length()-1 ; i >= 0 ; i--) {
//            newString.push(str.charAt(i));
//        }
//        return newString.toString();

        Stack<Character> newString = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            newString.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while(!newString.isEmpty()){
            reversed.append(newString.pop());
        }
        return reversed.toString();

    }



    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}
