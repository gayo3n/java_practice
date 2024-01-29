package practice.exercise.chapter3;
import java.util.Scanner;
public class En314 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int vertical = 0;
        int horizontal = 0;
        double area = 0;

        System.out.println("長方形の面積を求めます");
        System.out.print("縦の長さ：");
        vertical = stdIn.nextInt();

        System.out.print("横の長さ：");
        horizontal = stdIn.nextInt();

        area = vertical * horizontal;

        System.out.println("長方形の面積 ＝ " + area);
    }
    
}
