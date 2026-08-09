class A {
    public A() {
        super();
        System.out.println("in A");
    }
    public A(int a) {
        super();
        System.out.println("int i A ");
    }
}
class B extends A {
    public B() {
        System.out.println("in B");
    }
    public B(int a) {
        this();
        System.out.println("int in B ");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        B obj = new B(4);
    }
}