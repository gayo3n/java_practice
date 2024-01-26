package practice.exercise.chapter13.school_abstract;

public class BookKeepingStudent extends BasicStudent{
    // プロパティ
    private int accounting;
    private int business;

    // コンストラクタ
    public BookKeepingStudent(String name, String no, String schoolName, int accounting, int business){
        super(name, no, schoolName);
        this.accounting = accounting;
        this.business = business;
    }

    //平均点メソッド
    @Override public double calcAve(){
        double ave = (this.accounting + this.business) / 2;
        return ave;
    }
}
