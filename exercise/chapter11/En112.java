package practice.exercise.chapter11;
import java.util.Scanner;
public class En112 {



    public static void main(String[] args){
        // En112クラスのインスタンス化
        En112 en112 = new En112();
        // Mathクラスのインスタンス化
        Math math = en112.new Math();
        //  Scannerのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        // 数値の入力

        System.out.print("小さいほうの数値を入力してください：");
        math.x = stdIn.nextInt();

        System.out.print("大きいほうの数値を入力してください：");
        math.y = stdIn.nextInt();

        

        System.out.println(math.x + "から" + math.y + "までの合計値は" + math.sum(math.x, math.y) + "です。");
    }


    class Math{
        // インスタンス変数ｘ
        public int x;
        // インスタンス変数ｙ
        public int y;
        // 合計値の変数
        public int sum;
        public int sum(int a, int b){
            for (int i = 0; b >= a; b--){
                sum = sum +  b;
            }
        return sum;
        }
    }
}
