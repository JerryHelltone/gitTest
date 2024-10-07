package ForMe; //Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100]. Метод пузырька
               //Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
public class Ex2 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
//        out_for:
//        for (int i = 2; i <= 100; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    continue out_for;
//                }
//            }
//            System.out.println(i);
//        }
    }
}
