package practice.exercise.chapter15;
import java.util.Scanner;
public class En151 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        try{
            // 整数１
            System.out.print("整数１ = ");
            int num1 = stdIn.nextInt();
            // 整数２
            System.out.print("整数２ = ");
            int num2 = stdIn.nextInt();
            // 割り算する
            double result = num1 / num2;
            // 割り算の結果を表示する
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(ArithmeticException e){
            // エラーメッセージ表示
            System.out.println("0による割り算です！！");
        }finally{
            // 処理が終了したメッセージの表示
            System.out.println("処理終了");
        }
    }
    
}
