package lesson3;

public class taskFour {
    public static void main(String[] args) {
        for (char value = 'b'; !isVowels(value); value++) {
            System.out.println(value);
        }
    }
    private static boolean isVowels(char value) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'y';
    }
}
