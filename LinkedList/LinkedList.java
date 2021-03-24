public class LinkedList {
    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();

        // Add all the nodes given to the list
        sList.addNode(8);
        sList.addNode(10);
        sList.addNode(12);
        sList.addNode(16);
        sList.addNode(9);
        sList.addNode(14);

        // Display the nodes present in the list
        sList.display();
        System.out.println("\nList after inserting 15 in front");
        sList.push(15);
        sList.display();

        System.out.println("\nList after inserting 25 after node 16");
        sList.insertAfter(sList.head.next.next.next.next, 25);
        sList.display();

        System.out.println("\nList after deleting node 9");
        sList.deleteNode(9);
        sList.display();

        System.out.println("\nList after adding 30 after node 10");
        sList.insertAfter(sList.head.next.next, 30);
        sList.display();
        System.out.println("\nList after inserting 45 at the end");
        sList.insertAtEnd(45);
        sList.display();

        System.out.println("\nList after deleting node 8");
        sList.deleteNode(8);
        sList.display();

    }
}
