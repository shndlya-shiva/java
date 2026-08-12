package polymorphism;
// Dynamic Method Dispatch in Java is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
// In Java, when a subclass overrides a method of its superclass, the method that gets called is determined by the actual object type, not the reference type. This allows for polymorphic behavior, where a single method call can result in different implementations being executed based on the actual object being referenced.
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
        C obj = new D();
        obj.show();
    }
}