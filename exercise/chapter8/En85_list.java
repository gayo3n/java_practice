package practice.exercise.chapter8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class En85_list {
    public static void main(String[] args){
        // "Integer"はintの正式表現
        // "Arrays.asList"で初期化をしながらデータを追加できる
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        // 合計値
        int sum = 0;
        // "size"リストの要素数を取得するメソッド(=length)
        for (int i = 0; i < array.size(); i++){
            // "get(x)"リストのx番のデータを取得するメソッド
            sum += array.get(i);
        }
        System.out.println("合計値は" + sum + "です。");
        System.out.println("平均値は" + ((double)sum / array.size()) + "です。");
    }
    
}
