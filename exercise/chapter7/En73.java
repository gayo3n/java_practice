package practice.exercise.chapter7;
import java.util.Scanner;

public class En73 {

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値を入力：");
        String num = stdIn.nextLine();

        String[] list = num.split("");

        int x = 0;
        x = list.length;

        while (x != 0){
            System.out.print(list[x-1]);
            x = x - 1;
        }




    }
    
}
