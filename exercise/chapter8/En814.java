package practice.exercise.chapter8;
import java.util.LinkedHashMap;
import java.util.Map;

public class En814 {
    public static void main(String[] args){

        // ハッシュマップを作成
        // "Linked"を付けることで順番を保持する
        Map<String, String> memory =new LinkedHashMap<>();

        // データをを追加
        memory.put("野菜", "季節");
        memory.put("キャベツ", "春");
        memory.put("スイカ", "夏");
        memory.put("ナス", "秋");
        memory.put("ハクサイ", "冬");

        // for文で表示（拡張for文）
        // "entry"ででキーに応じた値を取得する
        for (Map.Entry<String, String> entry : memory.entrySet()){
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }
    }
    
}
