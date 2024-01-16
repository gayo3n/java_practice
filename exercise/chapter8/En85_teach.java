package practice.exercise.chapter8;

public class En85_teach {
    public static void main(String[] args){
        // arraylist
        int[] array = {1,2,3,4,5};
        // 合計値
        int sum = 0;
        // for文を使って５回繰り返す
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        // 合計値の表示
        System.out.println("合計値は" + sum + "です。");
        // 平均値の表示
        System.out.println("平均値は" + ((double)sum / array.length) + "です。");

    }
}
