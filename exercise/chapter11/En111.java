package practice.exercise.chapter11;
import java.util.Scanner;
import practice.exercise.chapter11.Circle;

public class En111 {
    class Circle{
        // フィールドを宣言
        // 円周率
        double pi;
        // 半径
        int r;
        // 長さ
        double length;
        // 面積
        double area;
        // 円周の計算をするメソッド作成
        public double math(int r, double pi){
            // lengthに円周の計算結果を代入
            length = (r + r) * pi;
            // lengthを返す
            return length;
        }
        // 面積の計算をするメソッド作成
        public double aarea(int r, double pi){
            // areaに面積の計算結果を代入
            area = (r * r) * pi;
            // areaを返す
            return area;
        }
    }
    public static void main(String[] args){
        // En111クラスのインスタンス化
        En111 en111 = new En111();
        // Circleクラスのインスタンス化
        Circle circle = en111.new Circle();
        // Scannerクラスのインスタンス化
        Scanner stdIn = new Scanner(System.in);
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
