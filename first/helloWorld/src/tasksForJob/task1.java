package tasksForJob;//переворачивания строки, изменив расположение символов в строке задом наперёд

import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        System.out.println("First variable: ");
        variable1();
//        System.out.println("Second variable: ");
//        variable2(); //не понимаю ошибку
//        System.out.println("Second variable: ");
//        variable3(); //не понимаю ошибку
//        System.out.println("Fourth variable: ");
//        variable4();
    }

    private static void variable1() {
        String value = "qwerty";
        System.out.println(value);
        StringBuilder result = new StringBuilder();
        result.append(value);
        result = result.reverse();
        System.out.println(result);
    }

    public static void  variable2(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
            System.out.println(result);
        }
    }

    public static void variable3(String str) {
        Stack<Character> reverseStack = new Stack<>();
        String result = "";
        for (Character character : str.toCharArray()) {
            reverseStack.add(character);
        }
        while (!reverseStack.isEmpty()) {
            result = result + reverseStack.pop();
            System.out.println(result);
        }
    }

    public static String variable4(String str) {
        String rightStr;
        String leftStr;
        int length = str.length();

        if (length <= 1) {
            return str;
        }

        leftStr = str.substring(0, length / 2);
        rightStr = str.substring(length / 2, length);

        return variable4(rightStr) + variable4(leftStr);
    }
}
