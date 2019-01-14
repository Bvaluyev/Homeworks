package Homework7;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(SumNumbers(100));
    }

    public static int SumNumbers(int s) {
        int sum = 0;
        for (int x = 1; x <= s; x++) {
            sum = sum + x;

        }
        return sum;
    }
}



//    Посчитать сумму чисел от 1..100 с помощью цикла for.
//        Вывести сумму на экран.
