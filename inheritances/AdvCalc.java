package inheritances;

public class AdvCalc extends Calc {
// Here in this AdvCalc class we are extending the Calc class and adding two more methods multiply and divide
// AdvCalc is a subclass of Calc class and it inherits the methods add and subtract from Calc class
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}