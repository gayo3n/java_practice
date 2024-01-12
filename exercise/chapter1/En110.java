package practice.exercise.chapter1;
import java.util.Scanner;

public class En110 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字の入力：");
        String mo = stdIn.nextLine();

        System.out.print("整数の入力：");
        String num = stdIn.nextLine();

        System.out.print("小数の入力：");
        String flo = stdIn.nextLine();


        System.out.println("入力された文字＝" + mo);
        System.out.println("入力された整数＝" + num);
        System.out.println("入力された小数＝" + flo);
    }
}
