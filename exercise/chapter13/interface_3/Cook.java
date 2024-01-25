package practice.exercise.chapter13.interface_3;

public class Cook implements Person{
    private String name;
    private String job;
    private String specialties;

    // コンストラクタ
    public Cook(String n, String j, String s){
        this.name = n;
        this.job = j;
        this.specialties = s;
    }

    @Override
    public void introduce(){
        System.out.println("氏名：" + this.name + "\n職種：" + this.job + "\n得意料理：" + this.specialties);
    }
}
