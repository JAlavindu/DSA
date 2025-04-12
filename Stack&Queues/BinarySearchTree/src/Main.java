public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(10);
        myBST.insert(5);
        myBST.insert(15);
        myBST.insert(3);
        myBST.insert(7);
        myBST.insert(12);

        System.out.println(myBST.root.value); // Should print 10
        System.out.println(myBST.root.left.value); // Should print 5

        System.out.println(myBST.contains(7)); // Should return true
    }
}