package practice.exercise.chapter8;
import java.util.Scanner;

// 教科書P169を参照
public class En85 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        // final変数を使って、個数の変更を可能にする
        final int num = 5;

        // int型、要素数５のリストを作成
        int[] list = new int[num];

        // 合計値の変数
        int sum = 0;

        // for文を使って入力した文字をリストに追加する
        for (int i = 0; i < 5; i++){
            System.out.print((i + 1) + "回目：数値を入力してください：");
            list[i] = stdIn.nextInt();
            sum += list[i];
        }
        
        // 配列の合計値と平均値を表示する
        System.out.println("合計値は" + sum + "です。");
        System.out.println("平均値は" + (double)sum / num + "です。");
    }
    
}
