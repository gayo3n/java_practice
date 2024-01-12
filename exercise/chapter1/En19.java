package practice.exercise.chapter1;

import java.util.Scanner;

public class En19 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("お名前を入力してください＞");
        String name = stdIn.nextLine();

        System.out.println("こんにちは" + name + "さん！");
    }
}
