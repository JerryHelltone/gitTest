package ForMe;//гирлянда

public class exECLighter {
    public static void main(String[] args) {
        int g = 78;
        System.out.println(Integer.toBinaryString(g));
    }
    static void blink(int g){
        g = ~g;
        System.out.println(Integer.toBinaryString(g));
    }
}
