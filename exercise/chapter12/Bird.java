package practice.exercise.chapter12;

// Birdクラス
class Bird extends Animal{
    // コンストラクタ
    Bird(int m){
        name = "鳥";
        move = m;
    }
    // moveメソッド
    public void move(){
        System.out.println(name + "は、" + move + "メートル飛びました。");
    }
}

