package practice.exercise.chapter3;
import java.util.Scanner;
public class En316 {
    public static void main(String[] args) {
        int r = 0;
        double pi = 3.1415;
        double area = 0;
        Scanner stdIn = new Scanner(System.in);

        System.out.println("円の面積を求めます");

        System.out.print("半径:");
        r = stdIn.nextInt();

        area = r * r * pi;
        System.out.println("円の面積 = " + area);
    }
    
}
