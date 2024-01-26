package practice.exercise.chapter15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class En152 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        try{
            // 整数を入力
            System.out.print("整数を入力 = ");
            int number = stdIn.nextInt();

            if (number % 2 == 0){           // ２で割り切れるときは偶数
                System.out.println(number + "は偶数");
            } else if (number % 2 == 1){    // 割り切れないときは奇数
                System.out.println(number + "は奇数");
            }
        } catch(InputMismatchException e){  // 整数でない場合はエラーメッセージを表示
            System.out.println("整数と認識できません！！");
        }

    }
    
}
