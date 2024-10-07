package ForMe; //Распечатать числа циклом while %5 == 0

public class exExamClouds6 {
    public static void main(String[] args) {
        int value = 100;
        while(value > 0){
            if(value%5 == 0) {
                System.out.println(value--);
            }
            --value;
        }
    }
}
