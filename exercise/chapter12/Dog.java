package practice.exercise.chapter12;

// Dogクラス
class Dog extends Animal{
    // コンストラクタ
    Dog(int m){
        name = "犬";
        move = m;
    }
    // moveメソッド
    public void move(){
        System.out.println(name + "は、" + move + "メートル走りました。");
    }
}
