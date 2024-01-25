package practice.exercise.chapter13.interface_3;

public class Cook implements Person{
    String name;
    String job;
    String specialties;

    // コンストラクタ
    public Cook(String n, String j, String s){
        name = n;
        job = j;
        specialties = s;
    }

    @Override
    public void introduce(){
        System.out.println("氏名：" + name + "\n職種：" + job + "\n得意料理：" + specialties);
    }
}
