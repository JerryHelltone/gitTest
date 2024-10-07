package lesson11;

import java.util.List;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception{
       try {
           doSmth(0);
       }finally {
           System.out.println("Finally main");
       }
    }

    private static int doSmth(int value) {
        try {
            if (value == 0){
                throw new IllegalArgumentException("Входной параметр value == 0");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally{
            System.out.println("Finally do smth");
        }
            return 1;
    }

    private static void handle (List<Integer> list) throws Exception {
        if (list == null || list.size() < 1){
            throw new Exception("Лист пришёл пустой либо null!");
        }
        System.out.println(list.size());
    }
}
