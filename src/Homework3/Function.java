package Homework3;

public class Function {
    public static void main(String[] args) {
        int a = 21;
        int b = 10;
        int result = a % b;
        if (isNumberEven(result)){
            System.out.println("Число является четным");
            }else{
            System.out.println("Число является нечетным");
            }
    }

    public static boolean isNumberEven(int num) {
        int result = num % 2;

        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}
//    Написать функцию, которая будет проверять четность некоторого числа используя операцию нахождения остатка от деления %.
