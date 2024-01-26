package practice.exercise.chapter13.school_abstract;
// 抽象クラス
public abstract class BasicStudent {
    private String name;
    private String no;
    private String schoolName;

    // コンストラクタ
    public BasicStudent(String name, String no, String schoolName) {
        this.name = name;
        this.no = no;
        this.schoolName = schoolName;
    }
    // 平均点メソッド（抽象）
    public abstract double calcAve();
}
