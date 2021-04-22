public class Main{
    // Driver program to check ArrayListClass
    public static void main(String args[])
    {
      ArrayListClass v
        = new ArrayListClass();
      v.push(10);
      v.push(20);
      v.push(30);
      v.push(40);
      v.push(50);
  
      System.out.println("ArrayList size: "
              + v.size());
      System.out.println(
        "ArrayList capacity: "
        + v.getcapacity());
      System.out.println(
        "ArrayList elements: ");
      v.print();
  
      v.push(100, 1);
  
      System.out.println(
        "\nAfter updating 1st index");
  
      System.out.println(
        "ArrayList elements: ");
      v.print();
      System.out.println(
        "Element at 1st index: "
        + v.get(1));
  
      v.pop();
  
      System.out.println(
        "\nAfter deleting the"
        + " last element");
  
      System.out.println(
        "ArrayList size: "
        + v.size());
      System.out.println(
        "ArrayList capacity: "
        + v.getcapacity());
  
      System.out.println(
        "ArrayList elements: ");
      v.print();
    }
   }