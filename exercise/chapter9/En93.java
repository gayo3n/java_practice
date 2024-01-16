package practice.exercise.chapter9;
import java.util.Scanner;

public class En93 {
    static void message(String word, int num){

        for (int i = 1; i <= num; i++){
            System.out.println(word);
        }

    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String mes = stdIn.nextLine();
        int n =stdIn.nextInt();

        message(mes, n);

    }
    
}
