package practice.exercise.chapter11;
import java.util.Scanner;

public class En113 {



    public static void main(String[] args){
        // Mathクラスのインスタンス化
        MyMath math = new MyMath();
        //  Scannerのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        // 数値の入力
        System.out.print("小さいほうの数値を入力してください：");
        math.x = stdIn.nextInt();

        System.out.print("大きいほうの数値を入力してください：");
        math.y = stdIn.nextInt();

        
        // 表示
        System.out.println(math.x + "から" + math.y + "までの合計値は" + math.sum() + "です。");
    }
}


class MyMath{
    // インスタンス変数ｘ
    int x;
    // インスタンス変数ｙ
    int y;

    // 合計値を求めるメソッド
    public int sum(){
        // 合計値の変数
        int sum = 0;
        // for文を使って足し算を繰り返す
        for (int i = x; y >= i; y--){
            sum = sum +  y;
        }
        return sum;
    }
}
