package Homework5;
public class SeasonIfElseIf {
    public static void main(String[] args) {
        IfElseIf (111);
    }
    public static void IfElseIf(int s){
        if (s == 12 || s == 1 || s == 2) {
            System.out.println("Winter is coming");
        } else if (s == 3 || s == 4 || s == 5) {
            System.out.println("Green Spring");
        }else if (s == 6 || s == 7 || s == 8) {
            System.out.println("Summer is Hot");
        }else if (s == 9 || s == 10 || s == 11) {
            System.out.println("Golden Autumn");
        }else {
            System.out.println("Run Forest Run");
        }
    }

}
