package practice.exercise.chapter13.interface_3;

public class Teacher implements Person{
    String name;
    String job;
    String subject;

    // コンストラクタ
    public Teacher(String n, String j, String s){
        this.name = n;
        this.job = j;
        this.subject = s;
    }

    @Override
    public void introduce(){
        System.out.println("氏名：" + this.name + "\n職種：" + this.job + "\n担当教科：" + this.subject);
    }
}
