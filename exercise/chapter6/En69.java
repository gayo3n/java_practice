package practice.exercise.chapter6;

public class En69 {

    public static void main(String[] args){

        for (int h = 1; h <= 9; h++){

            if (h % 2 == 1){
            System.out.println(h + "の段");

            for (int v = 1; v <= 9; v++){
                System.out.println(h + "×" + v + "=" + h*v);
            }
            }
        }
    }
    
}
