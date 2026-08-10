// Method Overriding
class C 
{
    public void show()
    {
        System.out.println("in C");
    }
    public void config()
    {
        System.out.println("config in C");
    }
}
class D extends C 
{
    public void show()
    {
         System.out.println("in D");
    }
}
public class Demo2 
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.show();
        obj.config();

    }
}