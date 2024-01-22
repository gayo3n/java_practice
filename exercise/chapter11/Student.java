package practice.exercise.chapter11;
// Studentクラス
public class Student{
        // 名前
        String name;
        // 学生番号
        String number;
        // 国語の点数
        int jap;
        // 数学の点数
        int math;
        // 英語の点数
        int eng;
        // Studentのコンストラクタ
        Student(String n, String num, int jp, int ma, int en){
            // 名前
            name = n;
            // 学生番号
            number = num;
            // 国語
            jap = jp;
            // 数学
            math = ma;
            // 英語
            eng = en;
        }
        // 点数の合計を計算するメソッド
        static double score_sum(int j, int m, int e){
            // 合計点を計算する変数
            int sum = 0;
            // 合計点の計算
            sum = j + m + e;
            // sumを返す
            return sum;
        }
        // 点数の平均を計算するメソッド
        static double score_ave(int j, int m, int e){
            // 平均点を計算する変数
            double ave = 0;
            // 合計点を計算する変数
            int sum = 0;
            // 合計点の計算
            sum = j + m + e;
            // 平均点の計算
            ave = sum / 3;
            // aveを返す
            return ave;
        }
    }