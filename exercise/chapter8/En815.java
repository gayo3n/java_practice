package practice.exercise.chapter8;
import java.util.LinkedHashMap;
import java.util.Map;

public class En815 {
    // マップ内の特定の値を検索し、そのキーを返す
    public static <K, V> K getKey(Map<K, V> map, V value){
        // for文を使ってキーとバリューを繰り返し見つける
        for (Map.Entry<K, V> entry: map.entrySet()){
            // "equals"を使ってバリューを現在のエントリのバリューと比較する
            if (value.equals(entry.getValue())) {
                // バリューに応じたキーを返す
                return entry.getKey();
            }
        }
        // 検索が終わっても値が見つからない場合は"null"を返す
        return null;
    }
    public static void main(String[] args){
        
        // ハッシュマップを作成
        // "Linked"を付けることで順番を保持する
        Map<String, String> memory =new LinkedHashMap<>();{
       
        // データをを追加
        memory.put("野菜", "季節");
        memory.put("キャベツ", "春");
        memory.put("スイカ", "夏");
        memory.put("ナス", "秋");
        memory.put("ハクサイ", "冬");

        // 
        System.out.print(getKey(memory, "季節"));
        System.out.println("：季節");

        System.out.print(getKey(memory, "春"));
        System.out.println("：春");
    }

    
}
}