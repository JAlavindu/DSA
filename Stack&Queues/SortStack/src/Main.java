public class Main {

    public static void sortStack(Stack stack){
        Stack sortedStack = new Stack();
        while(!stack.isEmpty()){
            if(sortedStack.isEmpty()){
                sortedStack.push(stack.pop());
            }else{
                int temp = (int) stack.pop();
                while(!sortedStack.isEmpty() && temp < (int) sortedStack.peek()){
                    stack.push(sortedStack.pop());
                }
                sortedStack.push(temp);
            }
        }
        while(!sortedStack.isEmpty()){
            stack.push(sortedStack.pop());
        }

    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}

