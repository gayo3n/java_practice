package practice.exercise.chapter4;
import java.util.Scanner;

public class En41 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("0～100までの得点（整数値）を入力してください：");
        int score = stdIn.nextInt();

        if(score >= 80){
        System.out.println("合格です");}
    }
    
}
