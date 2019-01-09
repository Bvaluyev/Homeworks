package Homework4;

public class converterUSDUAH {
    public static void main(String[] args) {


        System.out.println(convertUAHtoUSD(28.1, 8376));

    }

    public static double convertUAHtoUSD(double UAHcourse ,int USD) {
        return UAHcourse * USD;

    }
}
