package practice.exercise.chapter14;
import java.util.Scanner;
public class En142 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列を入力：");
        String word = stdIn.nextLine();
        int count = word.length();
        System.out.println("入力された文字数は" + count + "です。");
    }
}
