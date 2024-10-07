package lesson8;

public class Outer {
    public String value;

    public Outer(String value) {
        this.value = value;
    }

    public static class Inner{

        public String value = "inner";

        public void print(){
            Outer outer = new Outer("Outer");
            System.out.println(outer.value);
        }
    }
}
