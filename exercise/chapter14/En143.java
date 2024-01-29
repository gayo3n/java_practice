package practice.exercise.chapter14;
import java.util.Scanner;
public class En143 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        StringBuilder stringbuilder =new StringBuilder(9);
        System.out.print("文字列を入力：");
        String word = stdIn.nextLine();
        stringbuilder.append(word);

        if (stringbuilder.length() > 9){
            stringbuilder.delete(9, stringbuilder.length());
        }
        System.out.println("結果文字列：" + stringbuilder);
    }
}
