public class SciCalc extends AdvCalc {
// Here in this SciCalc class we are extending the AdvCalc class and adding two more methods
// square and squareRoot
// SciCalc is a subclass of AdvCalc class and it inherits the methods add, subtract, multiply and divide from AdvCalc class
    public int square(int a) {
        return a * a;
    }
    
    public double squareRoot(int a) {
        return Math.sqrt(a);
    }
}