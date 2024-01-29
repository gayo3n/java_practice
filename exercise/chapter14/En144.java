package practice.exercise.chapter14;
import java.util.Scanner;
public class En144 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("文字列を２つ入力してください。");
        System.out.print("１つ目文字列を入力：");
        String words1 = stdIn.nextLine();
        System.out.print("２つ目文字列を入力：");
        String words2 = stdIn.nextLine();

        if (words1.equals(words2)){
            System.out.println("同じ文字列です。");
        }
        else{
            System.out.println("違う文字列です。");
        }


    }
    
}
