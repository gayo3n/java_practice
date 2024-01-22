package practice.exercise.chapter9;
import java.util.ArrayList;
public class En913 {

    static  odd(int[] array){
        int count = 0;
        for (int num : array){
            if (num % 2 != 0) {
                count++;
            }
        }

        int[] oddList = new int[count];
        int index = 0;
        for (int num : array){
            if (num % 2 != 0){
                oddList[index++] = num;
            }
        }
        return oddList;
    }
    public static void main(String[] args){
        int[] list = {4, 9, 24, 45, 69, 22, 44, 51, 90, 78};
        for (int x = 0; x <= list.length; x++){
            int s = list[x];
            odd(s);
        }
    }
        System.out.println(oddList);
}
