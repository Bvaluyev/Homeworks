package Homework5;


public class BitDiv {

    public static void main(String[] args) {

        System.out.println(bitDivByFour(100, 4));

    }

    public static long bitDivByFour(double a, double b) {
        int e = (int) a;
        int t = (int) b;
        double x = (e >> t);
        return (int) x;
    }

}

