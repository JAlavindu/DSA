import java.util.Arrays;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE PARTITIONLIST METHOD HERE //
    public void partitionList(int x) {
//        Node temp = head;
//        int count = 0;
//        int[] less = new int[20];
//        int[] more = new int[20];
//
//        while (temp != null) {
//            for(int i = 0; i<length; i++){
//                if(temp.value < x){
//                    less[i] = temp.value;
//                }else{
//                    more[i] = temp.value;
//                }
//                temp = temp.next;
//            }
//        }
////        System.out.println("Less than x: " + Arrays.toString(less));
////        System.out.println("More than x: " + Arrays.toString(more));
//
//        System.out.println("LL after partitionList:");
//        for(int i = 0; i< less.length; i++){
//            if(less[i] != 0){
//                System.out.println(less[i]);
//            }
//        }
//
//        for (int i = 0; i < more.length; i++) {
//            if (more[i] != 0) {
//                System.out.println(more[i]);
//            }
//        }

        Node lessHead = new Node(0);
        Node greaterHead = new Node(0);
        Node less = lessHead, greater = greaterHead;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                less.next = current;
                less = less.next;
            } else {
                greater.next = current;
                greater = greater.next;
            }
            current = current.next;
        }

        greater.next = null;
        less.next = greaterHead.next;
        head = lessHead.next;
    }

}
