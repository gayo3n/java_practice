package practice.exercise.chapter3;
import java.util.Scanner;
public class En315 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int bottom = 0;
        int height = 0;
        double area = 0;

        System.out.println("三角形の面積を求めます");
        System.out.print("底辺の長さ:");
        bottom = stdIn.nextInt();

        System.out.print("高さ:");
        height = stdIn.nextInt();

        area = (bottom * height) / 2;

        System.out.println("三角形の面積 = " + area);
    }
}
