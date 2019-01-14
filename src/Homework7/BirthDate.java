package Homework7;

import java.util.Scanner;

public class BirthDate {
    public static void main(String args[]){
        System.out.print("Введите год вашего рождения: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Ваш возраст:" + " " + (2019 - number) + " " + "года.");
    }
}

