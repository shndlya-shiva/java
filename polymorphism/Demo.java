package polymorphism;

class A 
{
    public void display() 
    {
        System.out.println("This is class A");
    }
}
class B extends A
{

}
public class Demo 
{
    public static void main(String [] args) 
    {
    A obj = new B(); 
    obj.display();
// Here in this line we are creating an object of class B and assigning it to a reference variable of class A. 
// This is an example of polymorphism in Java, where a subclass object can be referred to by a superclass reference variable. 
// This allows for dynamic method dispatch, where the method that gets called is determined at runtime
// Based on the actual object type, rather than the reference type.
    }
}