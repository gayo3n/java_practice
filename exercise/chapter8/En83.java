package practice.exercise.chapter8;
import java.util.*;

public class En83 {

    
    static void display(){
        Scanner stdIn = new Scanner(System.in);

        List<Integer> g_list = new ArrayList<Integer>();
        List<Integer> k_list = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++){
            System.out.print(i + "件目：整数値を入力 = ");
            int num =stdIn.nextInt();

            if (num % 2 == 0){
                g_list.add(num);
            }
            else {
                k_list.add(num);
            }
            }
            System.out.println("偶数値配列 = " + g_list);
            System.out.println("奇数値配列 = " + k_list);
        
    }
    public static void main(String[] args){




        display();
    }
}
