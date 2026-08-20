// Enum Class 
// Specifing the values to constants variables
enum Laptops
{
    MacBook(2000),  XPS(2200), LOQ(1900), ThinkPad(1500), Victus;

    private int price;
    private Laptops() // Default Constructor
    {
        price = 1800;
    }
    private Laptops(int price) { // Parameterized Constructor for price
        this.price = price;
    }
    public int getPrice() // Getter
    {
        return price;
    }
    public void setPrice(int price) // Setter
    {
        this.price = price;
    }
}
public class Constants_Enum1 {
    public static void main(String[] args) {
        
        Laptops lap = Laptops.LOQ; // For one Constant
        System.out.println(lap + " : " + lap.getPrice());
        for (Laptops lap1 : Laptops.values()) // For all the values
        {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
    }
}
