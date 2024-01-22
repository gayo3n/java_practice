package practice.exercise.chapter11;
import java.util.Scanner;
public class En112 {



    public static void main(String[] args){
        //  Scannerのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        // 数値の入力

        System.out.print("小さいほうの数値を入力してください：");
        Math.x = stdIn.nextInt();

        System.out.print("大きいほうの数値を入力してください：");
        Math.y = stdIn.nextInt();

        
        // 表示
        System.out.println(Math.x + "から" + Math.y + "までの合計値は" + Math.sum() + "です。");
    }
}


class Math{
    // クラス変数ｘ
    static int x;
    // クラス変数ｙ
    static int y;

    // 合計値を求めるメソッド
    static int sum(){
        // 合計値の変数
        int sum = 0;
        // for文を使って足し算を繰り返す
        for (int i = x; y >= x; y--){
            sum = sum +  y;
        }
    return sum;
    }
}
