package Homework6;

public class DoWhile {
    public static void main(String[] args) {
        DoWhile(10);
    }

    public static int DoWhile(int x) {
        do {
            if (x % 1 == 0) {
                System.out.println(x);
            }
            x--;
        } while (x >= 1);
        return x;
    }
}

//Организовать цикл do..while обратного отсчета от 10 до 1 в выводом на экран.
//сделать как отдельный метод.