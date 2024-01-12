package practice.exercise.chapter7;
import java.util.Scanner;

public class En73 {

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値を入力：");
        String num = stdIn.nextLine();

        String[] list = num.split("");
        while (n : list){
            System.out.print(n);
        }

    }
    
}
