package Hometask1;

public class Owerloading {
    public static void main(String[] args) {
        int iResult = sub(10, 4);
        System.out.println(iResult);

        double dResult = sub(11.3, 7.0);
        System.out.println(dResult);
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
