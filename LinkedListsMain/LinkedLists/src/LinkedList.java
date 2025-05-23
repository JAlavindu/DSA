//public class LinkedList {
//    Node head;
//
//    public void insert(int data){
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//
//        if(head == null){
//            head = node;
//        }else{
//            Node n = head;
//            while(n.next != null){
//                n = n.next;
//            }
//            n.next = node;
//        }
//
//    }
//
//    public void show(){
//        Node node = head;
//        while(node.next != null){
//            System.out.println(node.data);
//            node = node.next;
//        }
//        System.out.println(node.data);
//    }
//
//    public void insertAtStart(int data){
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//        node.next = head;
//        head = node;
//    }
//
//    public void insertAt(int index, int data){
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//        if(index == 0){
//            insertAtStart(data);
//        }else{
//            Node n = head;
//            for(int i = 0; i < index - 1; i++){
//                n = n.next;
//            }
//            node.next = n.next;
//            n.next = node;
//        }
//    }
//
//    public void deleteAt(int index){
//        if(index == 0){
//            head = head.next;
//        }else{
//            Node n = head;
//            Node n1 = null;
//            for(int i = 0; i < index - 1; i++){
//                n = n.next;
//            }
//            n1 = n.next;
//            n.next = n1.next;
//            //System.out.println("n1" + n1.data);
//            n1 = null;
//        }
//    }
//}

public class LinkedList{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
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

    public void getHead() {
        System.out.println(head.value);
    }
    public void getTail() {
        System.out.println(tail.value);
    }
    public void getLength() {
        System.out.println(length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0) tail = null;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        };
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reversed (){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
