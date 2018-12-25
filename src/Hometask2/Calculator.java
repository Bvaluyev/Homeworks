package Hometask2;

public class Calculator {


    public static int calcMethod1(int a, int b, int c) {
        int result = (a + b * (c / 2));
        return result;
    }

    public static int calcMethod2(int a, int b) {
        int result = ((a * a + b * b)) % 2;
        return result;
    }

    public static int calcMethod3(int a, int b, int c) {
        int result = (a + b) / 12 * c % 4 + b;
        return result;
    }

    public static int calcMethod4(int a, int b, int c) {
        int result = (a - b * c) / (a + b) % c;
        return result;
    }
    }




