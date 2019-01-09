package Homework4;

public class TrainThatCould {
    public static void main(String[] args) {

        System.out.println(Trains(1, 50, 10));

    }

    public static boolean Trains(int V1Speed, int V2Speed, int Distance) {

     int x = (V1Speed / Distance);
     int y = (V2Speed / Distance);
        boolean result = (x > y) && (x > 4) && (y<=6);
        if (result == true) {
            System.out.println("Train that could");
        } else {
            System.out.println("chuh chuh maz@#$fka");
        }
        return result;
        }
    }
