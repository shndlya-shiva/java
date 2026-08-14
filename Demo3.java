// UpCasting and DownCasting
// UpCasting: Converting a subclass type to a superclass type
// DownCasting: Converting a superclass type to a subclass type
// In Java, UpCasting is done automatically by the compiler, while DownCasting requires explicit casting.   
class C
{
    public void show()
    {
        System.out.println("in C");
    }
}
class D extends C
{
    public void show()
    {
        System.out.println("in D");
    }
}
public class Demo3 
{
    public static void main(String[] args) 
    {
        C obj1 = new D(); // UpCasting
        obj1.show(); // Calls the overridden method in D

        D obj2 = (D) obj1; // DownCasting
        obj2.show(); // Calls the overridden method in D
    }   
}
