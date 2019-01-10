package Homework3;

public class Function {
    public static void main(String[] args) {
        int a = 23;
        int b = 10;
        int result = a % b;
        if (isNumberEven(result)){
            System.out.println("Число является четным");
            }else{
            System.out.println("Число является нечетным");
            }
    }

    public static boolean isNumberEven(int num) {
        return num % 2 == 0 ;
        }
    }