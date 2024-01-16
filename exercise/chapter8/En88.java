package practice.exercise.chapter8;
import java.util.Scanner;


public class En88 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        // メッセージの表示
        System.out.println("整数値を３つ入力してください。");

        // int型、要素数３のリストを作成
        int[] list = new int[3];

        // for文を使って三回繰り返す
        for (int i = 0; i < 3; i++){
            System.out.print((i+1) + "つ目の整数値：");
            list[i] = stdIn.nextInt();
        }

        // 最大値と最小値を追加する変数
        int max = list[0];
        int min = list[0];

        // for文を使って数値を判断
        for (int x = 1; x < list.length; x++){
            int y = list[x];
            // max = list[0]を基準にして最大値を判断
            if (max < y){
                max = y;
            }
            // min = list[0]を基準にして最小値を判断
            if (y < min){
                min = y;
            }
        }
        
        // 最大値と最小値を表示
        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);
    }
}

