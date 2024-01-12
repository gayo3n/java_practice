package practice.exercise.chapter1;
import java.util.Scanner;

public class En111 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("年：");
        String year = stdIn.nextLine();

        System.out.print("月：");
        String mon = stdIn.nextLine();

        System.out.print("日：");
        String date = stdIn.nextLine();


        System.out.println(year + "/" + mon + "/" +  date);
    }
}