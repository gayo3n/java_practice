package practice.exercise.chapter6;
import java.util.Scanner;

public class En610 {

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        
        System.out.println("直角三角形を描画します。");
        System.out.println("２～２０までの整数値を入力してください。");
        
        System.out.print("底辺の長さを入力：");
        int n = stdIn.nextInt();

        if (2 <= n && n <= 20){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("値が正しくありません。");
        }
    }

    }
    
