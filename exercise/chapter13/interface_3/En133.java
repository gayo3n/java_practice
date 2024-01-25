package practice.exercise.chapter13.interface_3;

public class En133 {
    public static void main(String[] args){
    Teacher te = new Teacher("竹井一馬", "教員", "情報処理");
    Cook co = new Cook("大原太郎", "シェフ", "オムライス");

    te.introduce();
    co.introduce();
    }
}
