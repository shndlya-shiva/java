// Class to Class --> Extends
// Class to Interface --> Implements
// Interface to Interface --> Extends

package InterFace;

interface C
{
    int age = 29;
    String name = "Matt Murdock";
    void show();

}
interface D 
{
    void run();
}
interface F extends D
{

}
// In interface we can implement two inteface in one class  
class E implements C,F 
{
        public void show()
        {
            System.out.println("In show");
        }
        public void run()
        {
            System.out.println("Running......");
        }
}
public class Demo2 
{
    public static void main(String[] args) 
    {
        C obj = new E();
        obj.show();
        D obj1 = new E();
        obj1.run();   
        System.out.println(C.age);
        System.out.println(C.name);    
    }
}