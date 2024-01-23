package practice.exercise.chapter12;
import java.util.Scanner;
// 親クラス Calculator
class Calculator{
    int x;
    int y;
    // 合計を計算するメソッド
    public int calcSum(int x, int y){
        int sum = this.x + this.y;
        return sum;
    }
    // 平均を計算するメソッド
    public int calcAve(int x, int y){
        int ave = (this.x + this.y) / 2;
        return ave;
    }
}
// Calculatorを継承したMoreClac
class MoreClac extends Calculator{
    // 乗算をするメソッド
    public double ClacPow(double x, double y){
        double pow = Math.pow(this.x, this.y);
        return pow;
    }
}
// メインクラス
public class En121 {
    public static void main(String[] args) {
        MoreClac more = new MoreClac();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力してください：");
        int num1 = stdIn.nextInt();

        System.out.print("整数を入力してください：");
        int num2 = stdIn.nextInt();

        System.out.println("Sum " + num1 + " and " + num2 + " = " + more.calcSum(num1, num2));
        System.out.println("Average " + num1 + " and " + num2 + " = " + more.calcAve(num1, num2));
        System.out.println("Power " + num1 + " of " + num2 + " = " + more.ClacPow(num1, num2));
    }
    
}
