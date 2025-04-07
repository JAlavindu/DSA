import org.w3c.dom.Node;

import java.sql.SQLOutput;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
        newNode.prev= tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        //my code
//        Node temp = tail;
//        if(head == null) return null;
//        if(head.next == null) return head;
//
//        tail=tail.prev;
//        tail.next = null;
//        temp.prev = null;
//        length--;
//
//        if(length == 0){
//            head = null;
//            tail = null;
//        }
//        return temp;

        // Solution
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        temp.prev = null;
        length--;
        return temp;
    }

    public void prePend(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if(length == 0) return null;
        if(length==1){
            head = null;
            tail = null;
        }else {

            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index < length/2){
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        //my solution
//        Node temp = head;
//        if(length == 0) return false;
//        if(index < 0 || index >= length) return false;
//
//        for(int i = 0; i<index; i++){
//            temp = temp.next;
//        }
//        temp.value = value;
//        return true;

        // Solution
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;

        if(index == 0 ){
            prePend(value);
            return true;
        }

        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        before.next = newNode;
        newNode.prev = before;
        after.prev = newNode;
        newNode.next = after;
        length++;
        return true;

    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;

        if(index == 0){
            return removeFirst();
        }

        if(index == length - 1){
            return removeLast();
        }

        //my code
//        Node temp = get(index);
//        Node before = temp.prev;
//        Node after = temp.next;
//        before.next = after;
//        after.prev = before;
//        temp.next = null;
//        temp.prev = null;
//        length--;
//        return temp;

        // Solution
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
}
