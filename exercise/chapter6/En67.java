package practice.exercise.chapter6;

public class En67 {

    public static void main(String[] args){

        for (int h = 1; h <= 9; h++){
            System.out.println(h + "の段");
            for (int v = 1; v <= 9; v++){
                System.out.println(h + "×" + v + "=" + h*v);
            }
        }
    }
    
}
