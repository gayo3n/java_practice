package practice.exercise.chapter4;
import java.util.Scanner;
public class En413 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("0～100までの得点（整数値）を入力してください。：");
        int score = stdIn.nextInt();

        if (score <= 0 || score >= 100){
            System.out.println("入力値が不正です。");
        }
        if (score == 100){
            System.out.println("満点合格です。");
        }
        if (score <= 100 && score >= 60){
            System.out.println("合格です。");
        }
        if (score >= 0 && score <= 59){
            System.out.println("不合格です。");
        }
    }
}
