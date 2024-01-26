package practice.exercise.chapter13.school_abstract;

public class ITStudent extends BasicStudent{
    // プロパティ
    private int html;
    private int javaScript;
    private int java;
    // コンストラクタ
    public ITStudent(String name,String no, String schoolName, int html, int javaScript, int java) {
        super(name, no, schoolName);
        this.html = html; 
        this.javaScript = javaScript;
        this.java = java;
    }
    // 平均点メソッド
    @Override public double calcAve(){
        double ave = (this.html + this.javaScript + this.java) / 3;
        return ave;
    }
}
