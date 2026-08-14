// Method Overriding
class A
{
    public void show()
    {
        System.out.println("in A");
    }
    public void config()
    {
        System.out.println("config in A");
    }
}
class B extends A 
{
    public void show()
    {
         System.out.println("in B");
    }
}
public class Demo2 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.show();
        obj.config();

    }
}