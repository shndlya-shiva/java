// AutoBoxing And AutoUnBoxing
// AutoBoxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
// For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.
public class Demo4 {
    public static void main(String[] args) 
    {
        // AutoBoxing
        int num = 10; // primitive int
        Integer num1 = num; // int is automatically converted to Integer
        double num2 = 20.5; // primitive double
        Double num3 = num2; // double is automatically converted to Double

        // AutoUnBoxing
        int num4 = num1; // Integer is automatically converted to int
        double num5 = num3; // Double is automatically converted to double

        String str = "12";
        int num6 = Integer.parseInt(str); // String to int conversion

        System.out.println("AutoBoxing: " + num1 + ", " + num3);
        System.out.println("AutoUnBoxing: " + num4 + ", " + num5);
        System.out.println("String to int: " + num6);
    }
    
}
