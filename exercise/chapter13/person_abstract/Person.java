package practice.exercise.chapter13.person_abstract;


// Personクラス（抽象）
public abstract class Person{
    protected String name;
    protected String job;
    // コンストラクタ
    Person(String n, String j){
        name = n;
        job = j;
    }
    // introduceメソッド
    // 派生クラスでこのメソッドの本体を実装する
    // ＝＞抽象メソッドにする
    public abstract void introduce();
}
