package practice.exercise.chapter3;
import java.util.Scanner;
public class En311 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列１：");
        String word1 = stdIn.nextLine();

        System.out.print("文字列２：");
        String word2 = stdIn.nextLine();

        System.out.println(word2 + word1);
    }
    
}
