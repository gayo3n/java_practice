package practice.exercise.chapter7;

public class En71 {

    public static void main(String[] args){

        int sum = 0;
        int num = 0;
        while (num < 100){
            num = num + 1;
            sum = sum + num;
        }

        System.out.println("合計：" + sum);
    }
    
}
