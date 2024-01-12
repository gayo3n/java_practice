package practice.exercise.chapter6;
public class En68 {

    public static void main(String[] args){

        for (int h = 9; h >= 1; h--){
            System.out.println(h + "の段");
            for (int v = 9; v >= 1; v--){
                System.out.println(h + "×" + v + "=" + h*v);
            }
        }
    }
    
}
