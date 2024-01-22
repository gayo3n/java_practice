package practice.exercise.chapter12;
import java.util.Scanner;
class Calculator{
    int x;
    int y;
    public int calcSum(int x, int y){
        int sum = x + y;
        return sum;
    }
    public int calcAve(int x, int y){
        int ave = (x + y) / 2;
        return ave;
    }
}

class MoreClac extends Calculator{
    public double ClacPow(double x, double y){
        double pow = Math.pow(x, y);
        return pow;
    }
}

public class En121 {
    public static void main(String[] args) {
        MoreClac more = new MoreClac();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力してください：");
        int x = stdIn.nextInt();

        System.out.print("整数を入力してください：");
        int y = stdIn.nextInt();

        System.out.println("Sum " + x + " and " + y + " = " + more.calcSum(x, y));
        System.out.println("Average " + x + " and " + y + " = " + more.calcAve(x, y));
        System.out.println("Power " + x + " of " + y + " = " + more.ClacPow(x, y));
    }
    
}
