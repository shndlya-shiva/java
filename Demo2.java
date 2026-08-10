// Method Overriding
class C 
{
    public void show()
    {
        System.out.println("in C");
    }
}
class D extends C 
{
    
}
public class Demo2 
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.show();
    }
}