class Node {
    int data; // integer data
    Node next; // pointer to the next node

    public Node(int data) {
        // set data in the allocated node and return it
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    private static Node rear = null, front = null;

    // Utility function to dequeue the front element
    public int dequeue() // delete at the beginning
    {
        if (front == null) {
            System.out.print("\nQueue Underflow");
            System.exit(1);
        }

        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);

        // advance front to the next node
        front = front.next;

        // if the list becomes empty
        if (front == null) {
            rear = null;
        }

        // deallocate the memory of the removed node and
        // optionally return the removed item
        int item = temp.data;
        return item;
    }

    // Utility function to add an item to the queue
    public void enqueue(int item) // insertio t the end
    {
        // allocate a new node in a heap
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);

        // special case: queue was empty
        if (front == null) {
            // initialize both front and rear
            front = node;
            rear = node;
        } else {
            // update rear
            rear.next = node;
            rear = node;
        }
    }

    // Utility function to return the top element in a queue
    public int peek() {
        // check for an empty queue
        if (front != null) {
            return front.data;
        } else {
            System.exit(1);
        }

        return front.data;

    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return rear == null && front == null;
    }
}
