package Homework4;

public class Farmer {

    public static void main(String[] args) {

        System.out.println (perimeter(50, 60));
        System.out.println(landarea(50,60));
    }

    public static String perimeter(int width, int lenght) {
        int perimeter = (width + lenght) * 2;
        String result = ("необходимо" +" "+ perimeter + " "+ "метров забора");
        return result;
    }

    public static String landarea(int width, int lenght) {
        int landarea = (width * lenght);
        String result = ("необходимо" +" " +landarea + " "+"метров газона");
        return result;
    }
}




 //S=AB, где A и B – длина и ширина прямоугольника. К примеру, ширина у вас 20 метров, а длина – 30.

//    Напишите две функции, которые по введенным длине и ширине участка вычисляют:
//        сколько забора понадобиться, чтобы его оградить (периметр участка).
//        сколько квадратных метров газона надо будет купить (площадь)
//        Выведите 	результат на экран: периметр и площадь.
