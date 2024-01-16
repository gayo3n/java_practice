package practice.exercise.chapter5;
import java.util.Scanner;
public class En51 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        // 入力を促す
        System.out.print("A～Dの値を入力してください：");
        // 入力された文字　＝　word
        String word = stdIn.nextLine();

        // switch文でA~Dに応じた評価を表示する
        switch (word) {
            case "A" : System.out.println("ランクAは評価「優」です。"); break;
            case "B" : System.out.println("ランクBは評価「良」です。"); break;
            case "C" : System.out.println("ランクCは評価「可」です。"); break;
            case "D" : System.out.println("ランクDは評価「不可」です。");   break;
        }

    }
    
}
