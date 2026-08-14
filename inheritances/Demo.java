package inheritances;

public class Demo {
    public static void main (String [] args)
    {
       SciCalc obj1 = new SciCalc();
       int result1 = obj1.add(4, 5);
       int result2 = obj1.subtract(5, 3);
       int result3 = obj1.multiply(4, 5);
       int result4 = obj1.divide(9, 3);
       int result5 = obj1.square(5);
       double result6 = obj1.squareRoot(25);
       System.out.println(result1); 
       System.out.println(result2);
       System.out.println(result3);
       System.out.println(result4);
       System.out.println(result5);
       System.out.println(result6);
    }
}