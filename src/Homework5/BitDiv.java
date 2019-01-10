package Homework5;


public class BitDiv {

    public static void main(String[] args) {

        System.out.println(bitDivByFour(100, 4));

    }

    public static long bitDivByFour(double a, double b) {
        long e = (long) a;
        long t = (long) b;
        long x = (e >> t);
        return x;
    }

}

