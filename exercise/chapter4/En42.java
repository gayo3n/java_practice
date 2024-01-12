package practice.exercise.chapter4;
import java.util.Scanner;

public class En42 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("0～100までの得点（整数値）を2つ入力してください");

        System.out.print("国語の得点：");
        int japan = stdIn.nextInt();

        System.out.print("英語の得点：");
        int english = stdIn.nextInt();

        if (japan == 100 && english == 100){
        System.out.println("満点です");}
    }
    
}
