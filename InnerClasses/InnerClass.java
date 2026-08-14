// Java program to demonstrate inner class
// An inner class is a class which is nested within another class
// Inner classes are used to logically group classes and interfaces in one place to be more readable and maintainable
// Inner classes can access all the members (including private) of the outer class
// Inner classes are used to implement event listeners in GUI applications, callbacks, data structures like linked lists, trees, etc. &  anonymous classes in Java
// Inner classes are of 4 types: 1. Non-static nested class (Inner class) 2. Static nested class 3. Local inner class 4. Anonymous inner class
// 
class E 
{
    int age;

    public void show ()
    {
        System.out.println("In show method of outer class");
    }
    // Non-static nested class (Inner class) is a class which is defined inside another class and is not declared as static
    class F
    {
        public void config()
        {
            System.out.println("In config method of inner class");
        }
    }
    // Static nested class is a static class which is defined inside another class
    static class G
    {
        public void display()
        {
            System.out.println("In display method of static inner class");
        }
    }
}
// Abstract class is a class that is declared with the abstract keyword.
abstract class cars
{
    public abstract void drive();
    public abstract void playMusic();
    
}
public class InnerClass
{
    public static void main (String [] args) 
    {
        // Creating object of outer class
        E obj = new E();
        obj.show();
        // Creating object of inner class
        // Syntax: OuterClass.InnerClass obj = outerObj.new InnerClass();
        E.F obj1 = obj.new F();
        obj1.config();
        // Creating object of static inner class
        // Syntax: OuterClass.StaticInnerClass obj = new OuterClass.StaticInnerClass();
        E.G obj2 = new E.G();
        obj2.display();
        // Creating an anonymous inner class which is a class without a name and is used to override the method of a class or interface
        E obj3 = new E()
        {
            public void show()
            {
                System.out.println("In show method of anonymous inner class");
            }
        };
        obj3.show();
        // Creating an abstract & anonymous inner class which is a class without a name and is used to override the method of an abstract class.
        cars obj4 = new cars()
        {
            // Overriding the abstract method of abstract class
            public void drive()
            {
                System.out.println("In drive method of abstract & anonymous inner class");
            }
            // It also works with multiple abstract methods of abstract class
            public void playMusic()
            {
                System.out.println("In playMusic method of abstract & anonymous inner class");
            }
        };
        obj4.drive();
        obj4.playMusic();
    }
}