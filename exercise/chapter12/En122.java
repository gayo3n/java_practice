package practice.exercise.chapter12;


class Person{
    String name;
    String job;
    // コンストラクタ
    Person(String n, String j){
        name = n;
        job = j;
    }
    // introduceメソッド
    public void introduce(){
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
    }
}

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
        System.out.println("職業：" + job);
        System.out.println("担当教科：" + subject);
    }
}

class Cook extends Person{
    String cooking;
    // コンストラクタ
    Cook(String n, String j, String c){
    // super();でPersonクラスのコンストラクタの呼び出し
    super(n, j);
    // cookingのコンストラクタ
    this.cooking = c;
    }
    // introduceメソッド
    public void introduce(){
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("得意料理：" + cooking);
    }
}

public class En122 {
   public static void main(String[] args) {
    Teacher kondo = new Teacher("近藤勇", "教員", "GO言語");
    Cook okita = new Cook("沖田総司","シェフ","オムライス");

    kondo.introduce();
    okita.introduce();
   } 
}
