package practice.exercise.chapter12;

// Whaleクラス
class Whale extends Animal{
    // コンストラクタ
    Whale(int m){
        name = "鯨";
        move = m;
    }
    // moveメソッド
    public void move(){
        System.out.println(name + "は、" + move + "キロメートル泳ぎました。");    
    }
}
