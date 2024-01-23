package practice.exercise.chapter12;

class Teacher extends Person{
    String subject;
    // コンストラクタ
    Teacher(String n, String j, String s){
    // super();でPersonクラスのコンストラクタの呼び出し
    super(n, j);
    // subjectのコンストラクタ
    this.subject = s;
    }
    // introduceメソッド
    public void introduce(){
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当教科：" + subject);
    }
}
