package polymorphism;
// Dynamic Method Dispatch in Java is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
// In Java, when a subclass overrides a method of its superclass, the method that gets called is determined by the actual object type, not the reference type. 
// This allows for polymorphic behavior, where a single method call can result in different implementations being executed based on the actual object being referenced.
// In the example below, we have a superclass C and a subclass D that extends C.
class C
{
    public void show()
    {
        System.out.println("Show in C");
    }
}
class D extends C
{
    public void show()
    {
        System.out.println("Show in D");
    }
}
public class Demo1
{
    public static void main(String [] args)
    {
        C obj = new C();
        obj.show();
        // Here in this line we are creating an object of class C and assigning it to a reference variable of class C.
        obj = new D();
        obj.show();
        // Here in this line we are creating an object of class D and assigning it to a reference variable of class C.
        // This is an example of polymorphism in Java, where a subclass object can be referred to by a superclass reference variable.
        // This allows for dynamic method dispatch, where the method that gets called is determined at runtime
        // Based on the actual object type, rather than the reference type.
    }
}