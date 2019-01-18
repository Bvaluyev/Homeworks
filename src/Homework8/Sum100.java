package Homework8;




public class Sum100 {
    public static void main(String[] args) {
    RandomSum100();
    }
    public static void RandomSum100(){
        int sum100=0;
        for (int i = 0; i <101 ; i++) {
            int rnd  = (int) (Math.random() * 19 - 10);
        sum100 = rnd + i;
        }
        System.out.println(sum100);
    }
    }


//Просуммировать 100 случайно сгенерированных чисел в диапазоне
//от -10 до +9, т.е   -10 <= random < 10
//вывести полученную сумму на экран.