// Object Class equals() toString() hashCode() 
// equals() method is used to compare the content of the object
// toString() method is used to return the string representation of the object
// hashCode() method is used to return the hash code of the object
class laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " " + price;
    }
    public boolean equals(laptop that)
    {
        return this.model.equals(that.model) && this.price == that.price;
    }
}
public class Demo1 {
    public static void main(String[] args) 
    {
        laptop l1 = new laptop();
        l1.model = "Dell";
        l1.price = 50000;

        laptop l2 = new laptop();
        l2.model = "Dell";
        l2.price = 50000;

        boolean result = l1.equals(l2);
        System.out.println(result);
    }
}
