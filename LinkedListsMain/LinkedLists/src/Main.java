
public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insert(18);
//        list.insert(45);
//        list.insert(12);
//        list.insertAtStart(25);
//        //insert 55 at index 2
//        list.insertAt(2, 55);
//
//        //delete at index 2
//        list.deleteAt(2);
//        list.show();

        LinkedList myLinkedList = new LinkedList(4);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        myLinkedList.append(5);
        myLinkedList.prepend(1);

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());
        myLinkedList.printList();
    }
}