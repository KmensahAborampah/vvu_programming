// Creat a class and passing of an argument 
public class stacks<T> {

    // Private variable
    private Node<T> top = null;
    int items = 0;
 
    // Returns a bool data
    public boolean isEmpty(){
        return top == null;
    }

    public class Node<T> {
        private T data;
        private Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    // Returns generic data
    public T peek()
    {

        // Check for an empty stack 
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public void push(T data){
        Node<T> newNode = new Node<T>(data);

        if(top == null){
            top = newNode;
            items++;
        }
        else{
            newNode.data = data;
            newNode.next = top;
            top = newNode;
            items++;
        }
    }

    public T pop(){
        // Check for stack underflow
        if (top == null) {
            System.out.print("\nStack Empty");
            return null;
        }
        T popItem = top.data;
        top = top.next;
        items--;

        return popItem;

    }

    public void display()
    {
        // Check for stack underflow
        if (top == null) {
            System.out.print("\nStack Empty");
            return;
        }
        else {
            Node<T> items = top;
            while (items != null) {
 
                // print node data
                System.out.println("\n\n");
                System.out.printf("*******%10S********\n","==========");
                System.out.printf("*******" + items.data + "==========\n");
                System.out.printf("*******%10S********\n","==========");
                System.out.println("\n\n");
 
                // Assign temp link to temp
                items = items.next;
            }
        }
    }


    public static void main(String[] args)
    {
        // Create object of implementing class
        stacks<String> obj = new stacks<String>();
        // insert Stack value
        obj.push("Blue");
        obj.push("White");
        obj.push("Brown");
        obj.push("Green");
 
        // Print Stack elements
        obj.display();
 
        // Print top element of stack
        System.out.println("\nTop element is " + obj.peek());
 
        // Delete top element of Stack
        obj.pop();
        obj.pop();
 
        // Print stack elements
        obj.display();

        // Print top element of stack
        System.out.printf("\nTop element is " + obj.peek());
    }
}
