// Interface is a collection of abstract methods. 
// Interface is used to achieve abstraction and multiple inheritance in Java.
// Every method in interface is public and abstract by default. 
// Interface can have only abstract methods and final fields (constants).
// Interface cannot be instantiated (i.e. we cannot create object of interface).

package InterFace;

interface A
{
    int a = 10; // This is a constant (final field) in interface A.
    String str = "Hello"; // This is a constant (final field) in interface A.
    void show();
    void config();
}
class B implements A
// Here class B is implementing interface A, so it must provide implementation for all the methods of interface A.
// Implementing an interface is done using the 'implements' keyword.
{
    public void show()
    {
        System.out.println("Show method");
    }
    public void config()
    {
        System.out.println("Config method");
    }
}
public class Demo 
{
    public static void main(String [] args)
    {
        A obj = new B(); // Here we are creating an object of class B and assigning it to a reference of type A (interface).
        obj.show(); // Calling the show method of class B using the reference of type A.
        obj.config(); // Calling the config method of class B using the reference of type A.
        System.out.println("Value of a: " + A.a); // Accessing the constant 'a' from interface A.  
        System.out.println("Value of str: " + A.str); // Accessing the constant 'str' from interface A.
    }
}
