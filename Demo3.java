// UpCasting and DownCasting
// UpCasting: Converting a subclass type to a superclass type
// DownCasting: Converting a superclass type to a subclass type
// In Java, UpCasting is done automatically by the compiler, while DownCasting requires explicit casting.   
class A
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B");
    }
}
public class Demo3 
{
    public static void main(String[] args) 
    {
        A obj1 = new B(); // UpCasting
        obj1.show(); // Calls the overridden method in B

        B obj2 = (B) obj1; // DownCasting
        obj2.show(); // Calls the overridden method in B
    }   
}
