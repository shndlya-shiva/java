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
public class Demo2 {
    public static void main (String [] args)
    {
        final int a = 10;
        System.out.println(a);
        C obj = new C();
        obj.show();
    }
}
