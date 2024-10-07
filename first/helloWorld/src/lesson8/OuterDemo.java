package lesson8;

public class OuterDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("Test");
        Outer.Inner inner = new Outer.Inner();
        inner.print();
    }
}
