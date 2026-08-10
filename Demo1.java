// This and Super Keyword in Java
// This keyword is used to refer to the current class instance variable.
// Super keyword is used to refer to the parent class instance variable.
class C {
    public C() {
        super();
        System.out.println("in C");
    }
    public C(int a) {
        super();
        System.out.println("int i C ");
    }
}
class D extends C {
    public D() {
        System.out.println("in D");
    }
    public D(int a) {
        this();
        System.out.println("int in D ");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        D obj = new D(4);
    }
}