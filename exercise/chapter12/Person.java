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
        System.out.println("職種：" + job);
    }
}
