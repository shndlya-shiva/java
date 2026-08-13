// Abstarct class is a class that is declared with the abstract keyword.
// It may or may not include abstract methods. Abstract methods are methods that are declared without an implementation.
// An abstract class cannot be instantiated, but it can be subclassed.
// When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.
abstract class car
{
    public abstract void drive();
    public void playMusic()
    {
        System.out.println("Playing Music");
    }
}
class BMW extends car
{
    public void drive()
    {
        System.out.println("BMW is driving");
    }
}
public class Demo3 {
    public static void main (String [] args)
    {
        car c = new BMW();
        c.drive();
        c.playMusic();
    }
}
