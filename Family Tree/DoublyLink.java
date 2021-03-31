// DoublyLink class 

public class DoublyLink {
    public DoublyLink previous;
    public  String data;
    public DoublyLink next;

    // Constructor with String parameter
    public DoublyLink(String data){
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    // Overloaded constructor
    public DoublyLink(DoublyLink previous, String data, DoublyLink next){
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    // Data method returns the data passed to the contructor field
    public String data() {
        return data;
    }
    
}