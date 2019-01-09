package Homework4;

public class Sqaure {
    public static void main(String[] args) {
        double a = 1, b= 44, c=2;
        double d;
        double x1,x2;
        d = (b * b) - (4 * a * c);
        System.out.println("Дискриминант = " + d);
        if(d < 0)
            System.out.print("Уравнение не имеет решений!!!");
        else
        if(d == 0)
        {
            x1 = (-b) / (2 * a);
            System.out.println ("x = " + x1);
        }
        else
        {
            x1 = (-b + (d)) / (2 * a);
            x2 = (-b - (d)) / (2 * a);
            if (x1 == x2)
                System.out.println ("x1 = x2 " + x1);
            else
                System.out.println ("x1 =  " + x1 + "  x2 = " + x2);
        }
    }{System.out.println("!!!Ошибка ввода!!!");}
}


