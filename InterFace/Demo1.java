package InterFace;
// Another example of interface in Java.
// This example demonstrates how to use interfaces to achieve abstraction and polymorphism.

interface Computer
{
    void code();
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Coding on Laptop");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Coding on Desktop");
    }
}
public class Demo1 {
 public static void main(String[] args) {
        Computer lap = new Laptop(); // Creating an object of Laptop and assigning it to a reference of type Computer (interface).
        lap.code(); // Calling the code method of Laptop using the reference of type Computer.
        
        Computer desk = new Desktop(); // Creating an object of Desktop and assigning it to a reference of type Computer (interface).
        desk.code(); // Calling the code method of Desktop using the reference of type Computer.
    }      
}
