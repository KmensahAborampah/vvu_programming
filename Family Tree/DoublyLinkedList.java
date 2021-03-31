public class DoublyLinkedList {
    private DoublyLink head;
    private int size;

    public DoublyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    //insertAtFirst Method
    public void insertAtFirst(String data){
        if(head == null ){
            head = new DoublyLink(null, data, null);
        }
        else{
            DoublyLink newLink = new DoublyLink(null, data, head);
            head.previous = newLink;
            head = newLink;
        }
        size++;
    }
    
    // deleteFirst Method
    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        head.previous = null;
        size--;
        
    }

    // insertAtLast Method
    public void insertAtLast(String data){
        if(head == null){
            head = new DoublyLink(null, data, null);
        }
        else{
            DoublyLink currentLink = head;
            while(currentLink.next != null){
                currentLink = currentLink.next;
            }
            DoublyLink newLink = new DoublyLink(currentLink, data, null);
            currentLink.next = newLink;
        }
        size++;
    }

    // deleteLast Method
    public void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        DoublyLink currentLink = head;
        while(currentLink.next.next != null){
            currentLink = currentLink.next;
        }
        currentLink.next = null;
        size--;
    }



    public void insertAt(String data, int index){
        if(head == null){
            return;
        }
        if(index < 1 || index > size){
           return; 
        }

        DoublyLink currentLink = head;
        int i = 1;
        while(i < index){
            currentLink = currentLink.next;
            i++;
        }

        if(currentLink.previous == null){
            DoublyLink newLink = new DoublyLink(null, data, currentLink);
            currentLink.previous = newLink;
            head = newLink;
        }
        else{
            DoublyLink newLink = new DoublyLink(currentLink.previous, data, currentLink);
            currentLink.previous.next = newLink;
            currentLink.previous = newLink;
        }
        size++;
    }


    public void deleteAt( int index){
        if(head == null){
            return;
        }
        if(index < 1 || index > size){
            return; 
         }

        DoublyLink currentLink = head;
        int i = 1;
        while(i < index){
            currentLink = currentLink.next;
            i++;
        }
        if(currentLink.next == null){
            currentLink.previous.next = null;
        }
        else if(currentLink.previous == null){
            currentLink = currentLink.next;
            currentLink.previous = null;
            head = currentLink;
        }
        else{
            currentLink.previous.next = currentLink.next;
            currentLink.next.previous = currentLink.previous;
        }
        size--;
    }


    public void recursiveInsertAfter(DoublyLink currentLink ,String insertAfter, String data){
        if(head == null){
            return;
        }

        if(currentLink.data.equals(insertAfter)){
            DoublyLink newNode = new DoublyLink(data);
            if(currentLink.next != null){
                currentLink.next.previous = newNode;
                newNode.next = currentLink.next;
            }
            currentLink.next = newNode;
            newNode.previous = currentLink;
        }
        else{
            recursiveInsertAfter(currentLink.next, insertAfter, data);
        }
    }

    public void display(){

        DoublyLink currentLink = head;
        while(currentLink != null){
            System.out.println(currentLink.data());
            currentLink = currentLink.next;
            // System.out.println("size is " +size);
            System.out.println("\t||");
            System.out.println("\t||");
            System.out.println("\t\\/");
        }
    }




    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst("Mr. Brain Adomako Agyei");
        dll.insertAtLast("Nana Agyei Mensah");
        dll.insertAtLast("Obaapanin Adwubi Kete");
        dll.insertAtLast("Nana Amaning Agyei");
        dll.insertAtLast("Obaapanin Adwoa Badu");
        dll.insertAtLast("Nana Obrempong Agyei Mensah");
        dll.insertAtLast("Emmanuel Appiah-Agyei");
        dll.display();
        System.out.println("==============================");
        dll.deleteAt(2);
        dll.display();
        
       

    }
}
