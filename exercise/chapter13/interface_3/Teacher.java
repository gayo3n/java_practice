package practice.exercise.chapter13.interface_3;

public class Teacher implements Person{
    String name;
    String job;
    String subject;

    // コンストラクタ
    public Teacher(String n, String j, String s){
        name = n;
        job = j;
        subject = s;
    }

    @Override
    public void introduce(){
        System.out.println("氏名：" + name + "\n職種：" + job + "\n担当教科：" + subject);
    }
}
