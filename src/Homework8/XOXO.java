package Homework8;

public class XOXO {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");

                }

            }
            System.out.println();
        }

    }
}




//        вывести на экран 5x5 квадрат как на экране ниже с помощью вложенных циклов :
//        x 0 0 0 0
//        0 x 0 0 0
//        0 0 x 0 0
//        0 0 0 x 0
//        0 0 0 0 x
