// Type of Interfaces:- 1 - Normal, 2 - Functional/SAM, 3 - Marker
// Normal Interfaces is the interface two or more methods.
// SAM stands for single abstract method it's an interface with only a single method in it.
// Marker interface is an interface with no methods in it.
// A blank interface is an example of marker interface.

package InterFace;

@FunctionalInterface
interface G
{
    void show();
}

@FunctionalInterface
interface H
{
    void show1(int n);
}

@FunctionalInterface
interface I
{
    int add(int i, int j);
}
public class Demo3 {
    public static void main(String[] args) {
        G objG = new G() 
        {
            public void show()
            {
                System.out.println("Show in G1");
            }
        };
        objG.show();
        // With Lambda Expression also it only works with functional interface
        G objG2 = () -> 
        System.out.println("Show in G2");
        objG2.show();
        // Lambda Expression with variables
        // It can also work with multiple varibales
        H objH = (int n) -> System.out.println(n);
        objH.show1(10);
        // Lambda Expression with return
        I objI = (i,j) -> i+j;
        int result = objI.add(24,6);
        System.out.println(result);
    }
}
