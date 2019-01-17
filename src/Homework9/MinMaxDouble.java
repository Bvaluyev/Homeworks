package Homework9;

public class MinMaxDouble {
    public static void main(String[] args) {
        MinMaxDouble();
    }

    public static void MinMaxDouble() {

        double[] ArrDouble = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double min = ArrDouble[0];
        double max = ArrDouble[1];
        for (int i = 0; i < ArrDouble.length; i++) {
            if (ArrDouble[i] < ArrDouble[0]) {
                min = ArrDouble[i];
            }else {
               if (ArrDouble[i] > ArrDouble[1]) {
                   max = ArrDouble[i];
                   System.out.println(max);

                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}



//- Написать ф-цию нахождения максимального элемента в массиве с целочисленным типом данных double[].
//        Проверить результат передав в качестве аргумента массив чисел типа double.
//b) int[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
//        Ожидаемый правильный ответ для min: 0.001
//        Ожидаемый правильный ответ для max: 43.543