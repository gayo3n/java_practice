package practice.exercise.chapter12;

class Cook extends Person{
    String specialties;
    // コンストラクタ
    Cook(String n, String j, String s){
    // super();でPersonクラスのコンストラクタの呼び出し
    super(n, j);
    // specialtiesのコンストラクタ
    this.specialties = s;
    }
    // introduceメソッド
    public void introduce(){
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }
}

