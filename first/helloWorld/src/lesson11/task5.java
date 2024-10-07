package lesson11;

public class task5 {
    public static void main(String[] args) {
       try{
           customCheck();
       } catch (CustomException e){
           e.printStackTrace();
       }
    }

    private static void customCheck(){
        try{
            int value = 0;
            test(value);
        } catch (IllegalArgumentException e){
            throw new CustomException(e);
        }
    }

    private static void test (int value) {
        if (value == 0) {
            throw new IllegalArgumentException("Value is not correct");
        }
    }
}
