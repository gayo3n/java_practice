package practice.exercise.chapter12;


public class En122 {
   public static void main(String[] args) {
    // Teacherクラスのインスタンス化
    Teacher kondo = new Teacher("近藤勇", "教員", "GO言語");
    // Cookクラスのインスタンス化
    Cook okita = new Cook("沖田総司","シェフ","オムライス");
    // 近藤のintroduce
    kondo.introduce();
    // 沖田のintroduce
    okita.introduce();
   } 
}
