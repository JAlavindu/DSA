import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value){
        stack2.push(value);
    }

    public int peek() {
        shiftStack();
        return stack1.peek();
    }

    public void shiftStack(){
        while(stack1.isEmpty()){
                    while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
