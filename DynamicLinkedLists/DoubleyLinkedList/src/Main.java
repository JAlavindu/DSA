public class Main {
    public static void main(String[] args) {
//        DoublyLinkedList myDLL = new DoublyLinkedList(7);
//
//        myDLL.printList();
//        myDLL.getHead();
//        myDLL.getTail();
//
//        myDLL.getLength();

//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//
//        myDLL.printList();
//
//        // 2 items - reutrns 2 node
//        System.out.println(myDLL.removeLast().value);
//
//        // 1 item - returns 1 node
//        System.out.println(myDLL.removeLast().value);
//
//        // 0 items - returns null
//        System.out.println(myDLL.removeLast());

        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);

        myDLL.printList();
        myDLL.prePend(1);
        myDLL.printList();

    }
}