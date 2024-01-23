package practice.exercise.chapter12;

class Human extends Animal{
    // コンストラクタ
    Human(int m){
        name = "人";
        move = m;
    }
    // moveメソッド
    public void move(){
        System.out.println(name + "は、" + move + "メートル歩きました。");
    }
}