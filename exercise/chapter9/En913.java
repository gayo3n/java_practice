package practice.exercise.chapter9;
public class En913 {

    static int[] odd(int[] array){
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
        int[] oddList = odd(list);

    for (int num : oddList){
        System.out.println(num);
    }
}
}
