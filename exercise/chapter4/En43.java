package practice.exercise.chapter4;
import java.util.Scanner;
public class En43 {
    public static void main(String[] args){
        // Scannerクラスのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        // メッセージの表示
        System.out.println("0～100までの得点（整数値）を2つ入力してください。");
        // 国語の得点の入力
        System.out.print("国語の得点：");
        int jap = stdIn.nextInt();
        // 英語の得点の入力
        System.out.print("英語の得点：");
        int eng = stdIn.nextInt();

        // 国語と英語が８０点以上の場合
        // 「２教科とも合格です」と表示する
        if (jap >= 80 && eng >= 80){
            System.out.println("2教科とも合格です");
        }
    }
}
