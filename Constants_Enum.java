// Enum is a special refernce Data Type used to define Constants

enum Status
{
    Running, Failed, Pending, Success;
}
public class Constants_Enum {
    public static void main(String[] args) {
        Status s = Status.Pending; // It returns the constant values from the class
        Status[] s1 = Status.values(); // It returns an array of all constants
        System.out.println(s);
        System.out.println(s1); // Printing it directly will return it address value for the values loop is used
        for (Status s2 : s1)
        {
            System.out.println(s2 + " : " + s2.ordinal()); // Oridinal returns the index values of the values
        }
        // Enum with if-else
        Status s3 = Status.Failed;
        if( s3 == Status.Failed)
            System.out.println("Try Again ");
        else if (s3 == Status.Pending) 
            System.out.println("Work in Progress ");
        else if (s3 == Status.Running) 
            System.out.println("Fetching Data ");
        else
            System.out.println("Congratulations ");
        // Enum with Switch Statement
        Status s4 = Status.Success;
        switch (s4) 
        {
            case Running:
                System.out.println("Fetching Data ");
                break;
            case Pending:
                System.out.println("Work in Progress ");
                break;
            case Success:
                System.out.println("Congratulations ");
                break;
            default:
                System.out.println("Try Again ");
            }
    }
}