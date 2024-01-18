package practice.exercise.chapter11;
import java.util.Scanner;
import practice.exercise.chapter11.Circle;

public class En111 {
    public static void main(String[] args){
        // Scannerクラスのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        // Circleクラスのインスタンス化
        Circle circle = new Circle();
        // オブジェクトを生成
        circle.pi = 3.1415;
        // 半径の入力
        System.out.print("半径を整数値で入力：");
        // 入力された数値をrに代入
        circle.r = stdIn.nextInt();
        // 計算結果の表示
        // 円周
        System.out.println("円周の長さは" + circle.math(circle.r, circle.pi) + "です。");
        // 面積
        System.out.println("円の面積は" + circle.aarea(circle.r, circle.pi) + "です。");
        
    }
    
}
