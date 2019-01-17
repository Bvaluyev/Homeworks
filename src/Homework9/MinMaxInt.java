package Homework9;

public class MinMaxInt {
    public static void main(String[] args) {
        MinMassive();
    }

    public static void MinMassive() {
        int min = 0;
        int max = 0;
        int[] aIntNums = {-10, 20, 34, -11, 100, 20};

        for (int i = 1; i < aIntNums.length; i++) {
            if (aIntNums[i] < min) {
                min = aIntNums[i];


                for (int q = 1; q < aIntNums.length; q++) {
                    if (aIntNums[q] > max) {
                        max = aIntNums[q];
//                        System.out.println(max);  // не пойму почему функция выводит все числа с положительным значением

                    }
                }
                System.out.println(min);
                System.out.println(max);
            }
        }
    }
}



//- Написать ф-цию нахождения минимального элемента в массиве с целочисленным типом данных int[].
//        Проверить результат передав в качестве аргумента значение массив чисел типа int.
//	a) int[] aIntNums = {-10, 20, 34, -11, 100, 20};
//            Ожидаемый правильный ответ для min: -11
//            Ожидаемый правильный ответ для max: -100
