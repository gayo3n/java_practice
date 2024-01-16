package practice.exercise.chapter9;
import java.util.Scanner;
public class En94 {

    static int math(int number){
        int value = number * 3;
        return value;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();
        System.out.println(num + "の9倍は" + math(num)*3 + "です。");
    }
    
}
