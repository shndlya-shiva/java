// Type of Interfaces:- 1 - Normal, 2 - Functional/SAM, 3 - Marker
// Normal Interfaces is the interface two or more methods.
// SAM stands for single abstract method it's an interface with only a single method in it.
// Marker interface is an interface with no methods in it.
// A blank interface is an example of marker interface.
// 

package InterFace;
interface G
{
    void show();
}
public class Demo3 {
    public static void main(String[] args) {
        G objG = new G() 
        {
            public void show()
            {
                System.out.println("Show in G");
            }
        };
        objG.show();
    }
}
