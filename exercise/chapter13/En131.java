package practice.exercise.chapter13;

// Teacherクラス
class Teacher extends Person{
    String subject;
    // コンストラクタ
    Teacher(String n, String j, String s){
        super(n, j);
        this.subject = s;
    }

    @Override
    public void introduce(){
        System.out.println("氏名：" + name + "\n職種：" + job + "\n担当科目：" + subject);
    }
}
// Cookクラス
class Cook extends Person{
    String specialties;
    // コンストラクタ
    Cook(String n, String j, String s){
        super(n, j);
        this.specialties = s;
    }
    @Override
    public void introduce(){
            System.out.println("氏名：" + name + "\n職種：" + job + "\n得意料理：" + specialties);
    }
}
// メインクラス
public class En131 {
    public static void main(String[] args){
    // Teacherクラスのインスタンス化
    Teacher te1 = new Teacher("竹井一馬", "教員","情報処理");
    // Cookクラスのインスタンス化
    Cook co1 = new Cook("大原太郎", "シェフ", "オムライス");

    te1.introduce();
    co1.introduce();
    }
}