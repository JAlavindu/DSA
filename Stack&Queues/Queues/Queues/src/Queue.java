public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void Enqueue(int value){
        Node newNode = new Node(value);
        Node temp = last;
        if(length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
            newNode.next = null;
        }
        length++;
    }

    public Node Dequeue(){
        if(length == 0) return null;
        Node temp = first;
        if(length ==1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
            length--;
        }
        return temp;
    }
}
