package practice.exercise.chapter6;

public class En67 {

    public static void main(String[] args){
        // for文を使って" x * y"の"x"を更新
        for (int x = 1; x <= 9; x++){
            System.out.println(x + "の段");
            // for文を使って" x * y"の"y"を更新
            for (int y = 1; y <= 9; y++){
                System.out.println(x + "×" + y + "=" + x*y);
            }
        }
    }
    
}
