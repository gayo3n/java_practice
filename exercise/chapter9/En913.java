package practice.exercise.chapter9;

public class En913 {

    static void odd(num){
        int odd_list = {};
        for (int i = 0; i < 10; i++){
            if (num[i] % 2 == 1){
                odd_list.add = num[i];
            }
        }
        System.out.println(odd_list);
    }
    public static void main(String[] args){
        int[] list = {4, 9, 24, 45, 69, 22, 44, 51, 90, 78};
        for (int x = 0; x <= list.length; x++){
            odd(list[0]);
        }
    }
    
}
