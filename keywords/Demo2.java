// Final Keyword in Java
// Final keyword in Java is used to restrict the user. The final keyword can be used in many contexts.
// Final variable: Once a final variable is assigned, it cannot be changed. It can be assigned only once.
// Final method: A final method cannot be overridden by subclasses.
// Final class: A final class cannot be subclassed. It can be used to prevent inheritance.
final class C
{
    public void show()
    {
        System.out.println("This is a final class");
    }
}
class D
{
    public final void show()
    {
        System.out.println("This is a normal class");
    }
}
class E extends D
{
    public void show() // This will cause a compile-time error because the show() method in class D is declared as final and cannot be overridden in subclass E.
    {
        System.out.println("This is a subclass of class D");
    }
}
public class Demo2 {
    public static void main (String [] args)
    {
        final int a = 10;
        System.out.println(a);
        C obj = new C();
        obj.show();
        D obj2 = new D();
        obj2.show();
        E obj3 = new E();
        obj3.show();
    }
}
