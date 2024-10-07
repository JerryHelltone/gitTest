package lesson11;

public class task3and4 {
    public static void main(String[] args) throws CustomException {
     checkCustomException(0);
    }
    private static void checkCustomException(int value) throws CustomException{
        try {
            if (value == 0){
                CustomException exception = new CustomException("My exception message");
                throw exception;
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
