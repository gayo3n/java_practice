package practice.exercise.chapter11;

public class Circle{
    // フィールドを宣言
    // 円周率
    double pi;
    // 半径
    int r;
    // 長さ
    double length;
    // 面積
    double area;
    // 円周の計算をするメソッド作成
    public double math(int r, double pi){
        // lengthに円周の計算結果を代入
        double length = (r + r) * pi;
        // lengthを返す
        return length;
    }
    // 面積の計算をするメソッド作成
    public double aarea(int r, double pi){
        // areaに面積の計算結果を代入
        double area = (r * r) * pi;
        // areaを返す
        return area;
    }
}
