package practice.exercise.chapter5;

import java.util.Scanner;

public class En52 {

        public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        // 入力を促す
        System.out.print("クラス番号（1～3）の値を入力してください：");
        // 入力された文字　＝　word
        int num = stdIn.nextInt();

        // switch文でA~Dに応じた評価を表示する
        switch (num) {
            case 1 : System.out.println("情報処理コース"); break;
            case 2 : System.out.println("OAビジネスコース"); break;
            case 3 : System.out.println("税理士コース"); break;
            default : System.out.println("不正な入力です");   break;
        }

    }
    
}
