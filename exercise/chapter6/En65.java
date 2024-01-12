package practice.exercise.chapter6;

import java.util.Scanner;

public class En65 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("入力文字列：");
        String word = stdIn.nextLine();

        String[] list = word.split("");
        for (String s : list){
            System.out.println(s);
        }
    }
    
}
