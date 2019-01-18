package Homework8;


public class EagleAndTails {
    public static void main(String[] args) {

        EagleAndTails();
    }

    public static void EagleAndTails() {
        int Eagle = 0;
        int Tail = 0;

        for (int i = 0; i < 2000; i++) {
            int rnd = (int) (Math.random() * 2);
            if (rnd == 1) {
                Eagle = rnd + Eagle;

            } else {
                Tail = Tail + 1;
            }
        }
        System.out.println("Орел выпал:" + " " + Eagle + " " + "раз.");
        System.out.println("Решка выпала:" + " " + Tail + " " + "раз.");

    }
}


//    Смоделировать игру “Орел и Решка”.
//        Бросить монетку 2000 раз и посчитать сколько раз выпал “орел”, а сколько раз “решка”.
//        Подсказка: использовать генератор случайных чисел с генерацией чисел в диапазоне от 0 до 1. Если генератор выдает 1 - орёл, а 0 - решка.
//
//        Вывести результаты.
//
//

