package lesson2;

public class FunctionTest {
    public static void main(String[] args) {
//        System.out.println(findMax(5, 8)); // значения вместо ввода с клавиатуры
//        System.out.println(findMax(-123, 456798));
//        System.out.println(findMax(-123, -87654));

//        System.out.println(cube(3));
//        System.out.println(cube(4));
//        System.out.println(cube(5));

//        System.out.println(checkIntValue(13));
//        System.out.println(checkIntValue(12));
//        System.out.println(checkIntValue(146783));
//        System.out.println(checkIntValue(157));

//        System.out.println(isEven(12));
//        System.out.println(isEven(801));
//        System.out.println(isEven(5));
//        System.out.println(isEven(992));

//        System.out.println(shiftChar('a', 0));
//        System.out.println(shiftChar('a', 1));
//        System.out.println(shiftChar('a', 5));
    }

    public static int findMax(int firstValue, int secondValue) {
        return firstValue > secondValue ? firstValue : secondValue;

//        if (firstValue > secondValue){
//            return firstValue;
//        } else {
//            return secondValue;
//        }
    }

    public static int cube ( int value){
        return (int) Math.pow(value, 3);
    }

    public static boolean checkIntValue(int value){
        return value%10 == 3;
    }

    public static boolean isEven(int value){
        return value%2 == 0;
    }

    public static char shiftChar(char value, int shift){
        return (char)(value + shift);
    }
}

