package practice.exercise.chapter12;

// Animalクラス
public class Animal{
    String name;
    int move;
    // moveメソッド
    public void move(){
        System.out.println(name + "は、" + move + "メートル移動しました。");
    }
    // eatメソッド
    public void eat(String food){
        System.out.println(name + "は、" + food + "を食べました。");
    }
}