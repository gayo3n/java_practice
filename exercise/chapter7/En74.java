package practice.exercise.chapter7;

public class En74 {
    public static void main(String[] args){

        int sum = 0;
        int num = 0;
        // whileで合計(sum)が100000を超えるまで繰り返す
        while(sum <=100000){
            // numに１を足し続ける
            num = num + 1;
            // 合計(sum)の更新
            sum = sum + num;
        }

        System.out.println("合計が100000を超える n は" + num + "です。");
    }
    
}
