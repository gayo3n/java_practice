package practice.exercise.chapter7;

public class En72 {

    public static void main(String[] args){
        int sum = 0;
        int num = 0;

        do {
            num = num + 1;
            sum = sum + num;
        } while(num < 100);

        System.out.println("合計：" + sum);
    }
    
}
